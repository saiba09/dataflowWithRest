package com.rest.DAO;

public class Patient {
String fullUrl;
resource resourceObject;

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

@Override
public String toString() {
	return "Patient [fullUrl=" + fullUrl + ", resourceObject=" + resourceObject 
			+ "]";
}


}
