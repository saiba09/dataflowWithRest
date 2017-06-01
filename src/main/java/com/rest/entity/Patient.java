package com.rest.entity;

public class Patient {
String fullUrl;
Resource resource;

public String getFullUrl() {
	return fullUrl;
}
public void setFullUrl(String fullUrl) {
	this.fullUrl = fullUrl;
}
public Resource getResourceObject() {
	return resource;
}
public void setResourceObject(Resource resourceObject) {
	this.resource = resourceObject;
}

@Override
public String toString() {
	return "Patient [fullUrl=" + fullUrl + ", resource=" + resource 
			+ "]";
}


}
