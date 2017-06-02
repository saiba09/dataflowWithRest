package com.rest.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rest.entity.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class RestHandler {
//	public static String getData(){
	public static void main(String[] args){
		String sql ="INSERT INTO `healthcare-12:Mihin_Data_Sample.PatientDataFromRest` ( patient_id, name, Address, city, State, maritialStatus, telecom, gender, birthDate, multipleBirthInteger, deceasedDateTime ) VALUES ";
		String values="";
		try{
			URL url = new URL("http://52.90.126.238:8080/fhir/baseDstu3/Patient");
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			System.out.println("before request");
			if(con.getResponseCode() == 200){
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
				StringBuilder sb = new StringBuilder();
				String line;				
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}	
				JSONParser parser = new JSONParser();
				Object obj = parser.parse(sb.toString());
				JSONObject jsonObject = (JSONObject) obj;
				JSONArray patientEntry = (JSONArray)jsonObject.get("entry");
				//System.out.println(patientEntry.get(0));
				for (int i = 0; i < patientEntry.size(); i++) {
					Gson gson = new GsonBuilder().create();
					Patient p = gson.fromJson(patientEntry.get(i).toString(), Patient.class);
					System.out.println("id" + p.getResourceObject().getId());
					System.out.println("add :" + p.getResourceObject().getAddress()[0].toString() );
					System.out.println("mar :"+p.getResourceObject().getMaritialStatus());
					System.out.println("tele :" + p.getResourceObject().getTelecom()[0].toString());
					System.out.println("gen :"+ p.getResourceObject().getGender() + "  : dob "+ p.getResourceObject().getBirthDate());
					values += "( '" +p.getResourceObject().getId()+"' , '"+p.getResourceObject().getName()[0].toString() +
							"' , '"+p.getResourceObject().getAddress()[0].toString() + "' , '"+p.getResourceObject().getAddress()[0].getCity() +"' , '"+
							p.getResourceObject().getAddress()[0].getState()+"' , '"+p.getResourceObject().getMaritialStatus().toString()+"' , '"+ p.getResourceObject().getTelecom()[0].toString()+"' , '" + 
							p.getResourceObject().getGender()+ "' , '" +p.getResourceObject().getBirthDate()+"' , '"+p.getResourceObject().getMultipleBirthInteger()+"' , '" +
							p.getResourceObject().getDeceasedDateTime()+"' ) ,";
					System.out.println("Values" +values);
				}
				
		//	values = values.substring(0, values.lastIndexOf(')')+1) ;
			System.out.println("sql" +sql+values);
			System.out.println("values 123" + values);
			//return sql+values;
			}
			

		}catch(Exception ex){
			System.out.println("exception : " + ex.getMessage());
		}
		//return sql;
	}
}
