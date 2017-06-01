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
		return "name [family=" + family + ", given=" + Arrays.toString(given) + "]";
	}
}
