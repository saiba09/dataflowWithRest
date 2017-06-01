package com.rest.entity;

import java.util.Arrays;

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
		return  family + " " + Arrays.toString(given) ;
	}
	public String getPatientName(){
		return family + " " + Arrays.toString(given) ;
	}
}
