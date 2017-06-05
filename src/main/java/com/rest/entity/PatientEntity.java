package com.rest.entity;

public class PatientEntity {
String patient_id;
String name ,Address,city ,State ,maritialStatus;
String telecom , gender ,birthDate ,deceasedDateTime;
int multipleBirthInteger ;
public String getPatient_id() {
	return patient_id;
}
public void setPatient_id(String patient_id) {
	this.patient_id = patient_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getMaritialStatus() {
	return maritialStatus;
}
public void setMaritialStatus(String maritialStatus) {
	this.maritialStatus = maritialStatus;
}
public String getTelecom() {
	return telecom;
}
public void setTelecom(String telecom) {
	this.telecom = telecom;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getBirthDate() {
	return birthDate;
}
public void setBirthDate(String birthDate) {
	this.birthDate = birthDate;
}
public String getDeceasedDateTime() {
	return deceasedDateTime;
}
public void setDeceasedDateTime(String deceasedDateTime) {
	this.deceasedDateTime = deceasedDateTime;
}
public int getMultipleBirthInteger() {
	return multipleBirthInteger;
}
public void setMultipleBirthInteger(int multipleBirthInteger) {
	this.multipleBirthInteger = multipleBirthInteger;
}
}
