package com.cubetutor.quietspec4j.service;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

public interface QuietSpecHttpConnector {

	public String makeRequest(String uri)  throws ClientProtocolException, IOException, IllegalStateException;
	
}
