package com.rest.DAO;

import java.util.Arrays;

public class meta{
	String versionId, lastUpdated;
	@Override
	public String toString() {
		return "meta [versionId=" + versionId + ", lastUpdated=" + lastUpdated + "]";
	}

	public String getVersionId() {
		return versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	
}
class text{
	String status , div;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}
}
class identifier{
	String use;
	type typeObject;
	String system , value;
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public type getTypeObject() {
		return typeObject;
	}
	public void setTypeObject(type typeObject) {
		this.typeObject = typeObject;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
class type{
	coding[] codingObject;
	String text;
	public coding[] getCodingObject() {
		return codingObject;
	}
	public void setCodingObject(coding[] codingObject) {
		this.codingObject = codingObject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
class coding{
	String system,code,display;

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}
}
class name{

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
class telecom{
	String system, value,use;

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}
}
class address{

	String use,type,city,district,postalCode,state;
	String [] line;
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String[] getLine() {
		return line;
	}
	public void setLine(String[] line) {
		this.line = line;
	}
}
class maritalStatus{
	coding[] coding;

	public coding[] getCoding() {
		return coding;
	}

	public void setCoding(coding[] coding) {
		this.coding = coding;
	}
}