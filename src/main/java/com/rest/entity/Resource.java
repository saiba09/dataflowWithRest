package com.rest.entity;


public class Resource {

String id; //
Name[] name;//
Telecom[] telecom;//
String gender;//
String birthDate;//
String deceasedDateTime;//
Address[] address;//
MaritalStatus maritalStatus ;//
int multipleBirthInteger;//
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public Name[] getName() {
	return name;
}
public void setName(Name[] name) {
	this.name = name;
}
public Telecom[] getTelecom() {
	return telecom;
}
public void setTelecom(Telecom[] telecom) {
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
public Address[] getAddress() {
	return address;
}
public void setAddress(Address[] address) {
	this.address = address;
}
public MaritalStatus getMaritialStatus() {
	return maritalStatus;
}
public void setMaritialStatus(MaritalStatus maritialStatus) {
	this.maritalStatus = maritialStatus;
}
public int getMultipleBirthInteger() {
	return multipleBirthInteger;
}
public void setMultipleBirthInteger(int multipleBirthInteger) {
	this.multipleBirthInteger = multipleBirthInteger;
}
}
