package com.cubetutor.quietspec4j.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.cubetutor.quietspec4j.exception.QuietSpec4JException;
import com.cubetutor.quietspec4j.service.QuietSpecHttpConnector;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class QuietSpectHttpConnectorImpl implements QuietSpecHttpConnector {

	private String apiKey;

	@Inject
	public QuietSpectHttpConnectorImpl(@Named("api.key") String apiKey) {
		this.apiKey = apiKey;
	}
	
	public String makeRequest(String uri) throws ClientProtocolException, IOException, IllegalStateException, QuietSpec4JException {
		HttpClient client = new DefaultHttpClient();
		HttpGet get = new HttpGet(addApiKey(uri));
		
		System.out.println(get.getURI());
		
		HttpResponse response = client.execute(get);

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
		    result.append(line);
		}

		String responseString = result.toString();
		
		if(responseString.startsWith("{\"fault\"")) {
			throw new QuietSpec4JException("QuietSpec Fault: "+responseString);
		}
		
		return responseString;
	}

	private String addApiKey(String uri) {
		return uri + "?apikey="+apiKey;
	}

}
