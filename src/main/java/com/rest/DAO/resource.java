package com.rest.DAO;

import java.util.Arrays;

public class resource {

String id; //
name[] nameObject;//
telecom[] telecomObject;//
String gender;//
String birthDate;//
String deceasedDateTime;//
address[] addressObject;//
maritalStatus maritialStatusObject ;//
int multipleBirthInteger;//
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
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

public int getMultipleBirthInteger() {
	return multipleBirthInteger;
}
public void setMultipleBirthInteger(int multipleBirthInteger) {
	this.multipleBirthInteger = multipleBirthInteger;
}
public maritalStatus getMaritialStatusObject() {
	return maritialStatusObject;
}
public void setMaritialStatusObject(maritalStatus maritialStatusObject) {
	this.maritialStatusObject = maritialStatusObject;
}
@Override
public String toString() {
	return "resource [id=" + id + ", nameObject=" + Arrays.toString(nameObject) + ", telecomObject="
			+ Arrays.toString(telecomObject) + ", gender=" + gender + ", birthDate=" + birthDate + ", deceasedDateTime="
			+ deceasedDateTime + ", addressObject=" + Arrays.toString(addressObject) + ", maritialStatusObject="
			+ maritialStatusObject + ", multipleBirthInteger=" + multipleBirthInteger + "]";
}


}