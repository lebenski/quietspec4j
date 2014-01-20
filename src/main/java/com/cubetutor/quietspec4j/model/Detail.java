package com.cubetutor.quietspec4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Detail {

	@JsonProperty("errorcode")
	private String errorCode;

	@Override
	public String toString() {
		return "Detail [errorCode=" + errorCode + "]";
	}
	
	
	
}
