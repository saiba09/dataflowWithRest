package com.rest.DAO;

public class Patient {
String fullUrl;
resource resourceObject;
search searchObject;
public String getFullUrl() {
	return fullUrl;
}
public void setFullUrl(String fullUrl) {
	this.fullUrl = fullUrl;
}
public resource getResourceObject() {
	return resourceObject;
}
public void setResourceObject(resource resourceObject) {
	this.resourceObject = resourceObject;
}
public search getSearchObject() {
	return searchObject;
}
public void setSearchObject(search searchObject) {
	this.searchObject = searchObject;
}
@Override
public String toString() {
	return "Patient [fullUrl=" + fullUrl + ", resourceObject=" + resourceObject + ", searchObject=" + searchObject
			+ ", getFullUrl()=" + getFullUrl() + ", getResourceObject()=" + getResourceObject() + ", getSearchObject()="
			+ getSearchObject() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}

}
