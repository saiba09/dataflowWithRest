package com.rest.entity;


public class MaritalStatus {
	Coding[] coding;

	public Coding[] getCoding() {
		return coding;
	}

	public void setCoding(Coding[] coding) {
		this.coding = coding;
	}
	@Override
	public String toString(){
		return coding[0].getCode();
	}
}
