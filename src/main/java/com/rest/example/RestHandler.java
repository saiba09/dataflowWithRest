package com.rest.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

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
				System.out.println(sb.toString());
			}
			
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
