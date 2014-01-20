package com.cubetutor.quietspec4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "fault")
public class Fault {

	private String faultString;
	private Detail detail;
	
	public String getFaultString() {
		return faultString;
	}
	
	@JsonProperty("faultstring")
	public void setFaultString(String faultString) {
		this.faultString = faultString;
	}
	
	public Detail getDetail() {
		return detail;
	}
	
	@JsonProperty("detail")
	public void setDetail(Detail detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Fault [faultString=" + faultString + ", detail=" + detail + "]";
	}
}
