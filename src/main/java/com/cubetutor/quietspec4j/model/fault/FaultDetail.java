package com.cubetutor.quietspec4j.model.fault;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FaultDetail {

	@JsonProperty("errorcode")
	private String errorCode;

	@Override
	public String toString() {
		return "Detail [errorCode=" + errorCode + "]";
	}
	
	
	
}
