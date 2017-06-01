package com.rest.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rest.DAO.Patient;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class RestHandler {
	public static void main(String[] args) {
		try{
			URL url = new URL("http://52.90.126.238:8080/fhir/baseDstu3/Patient");
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			
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
				for (int i = 0; i < patientEntry.size(); i++) {
					 Gson gson = new GsonBuilder().create();
			            Patient p = gson.fromJson(patientEntry.get(i).toString(), Patient.class);
			            System.out.println(p);
				}
			}
			
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
