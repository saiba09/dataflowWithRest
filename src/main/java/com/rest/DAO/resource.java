package com.rest.DAO;

public class resource {
String resourcrType;
String id;
meta metaOnject;
String language;
text textObject;
identifier[] identifierObject;
Boolean active;
name[] nameObject;
public String getResourcrType() {
	return resourcrType;
}
public void setResourcrType(String resourcrType) {
	this.resourcrType = resourcrType;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public meta getMetaOnject() {
	return metaOnject;
}
public void setMetaOnject(meta metaOnject) {
	this.metaOnject = metaOnject;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public text getTextObject() {
	return textObject;
}
public void setTextObject(text textObject) {
	this.textObject = textObject;
}
public identifier[] getIdentifierObject() {
	return identifierObject;
}
public void setIdentifierObject(identifier[] identifierObject) {
	this.identifierObject = identifierObject;
}
public Boolean getActive() {
	return active;
}
public void setActive(Boolean active) {
	this.active = active;
}
public name[] getNameObject() {
	return nameObject;
}
public void setNameObject(name[] nameObject) {
	this.nameObject = nameObject;
}
public telecom[] getTelecomObject() {
	return telecomObject;
}
public void setTelecomObject(telecom[] telecomObject) {
	this.telecomObject = telecomObject;
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
public address[] getAddressObject() {
	return addressObject;
}
public void setAddressObject(address[] addressObject) {
	this.addressObject = addressObject;
}
public String getMaritalStatus() {
	return maritalStatus;
}
public void setMaritalStatus(String maritalStatus) {
	this.maritalStatus = maritalStatus;
}
public coding[] getCodingObject() {
	return codingObject;
}
public void setCodingObject(coding[] codingObject) {
	this.codingObject = codingObject;
}
public int getMultipleBirthInteger() {
	return multipleBirthInteger;
}
public void setMultipleBirthInteger(int multipleBirthInteger) {
	this.multipleBirthInteger = multipleBirthInteger;
}
telecom[] telecomObject;
String gender;
String birthDate;
String deceasedDateTime;
address[] addressObject;
String maritalStatus;
coding [] codingObject;
int multipleBirthInteger;
}
class search{
	String mode ;

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
}