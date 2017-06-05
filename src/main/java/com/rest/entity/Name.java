package com.rest.entity;


public class Name {
	String family;
	String given[] ;
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String[] getGiven() {
		return given;
	}
	public void setGiven(String[] given) {
		this.given = given;
	}
	@Override
	public String toString() {
		return  family + " " + getGivenName() ;
	}
	public String getPatientName(){
		return family + " " + getGivenName() ;
	}
	private String getGivenName() {
		// TODO Auto-generated method stub
		String given = "";
		for (String string : this.given) {
			given += string;
		}
		return given;
	}
}
