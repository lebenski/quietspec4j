package com.cubetutor.quietspec4j.model.fault;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "fault")
public class Fault {

	private String faultString;
	private FaultDetail detail;
	
	public String getFaultString() {
		return faultString;
	}
	
	@JsonProperty("faultstring")
	public void setFaultString(String faultString) {
		this.faultString = faultString;
	}
	
	public FaultDetail getDetail() {
		return detail;
	}
	
	@JsonProperty("detail")
	public void setDetail(FaultDetail detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Fault [faultString=" + faultString + ", detail=" + detail + "]";
	}
}
