package com.cubetutor.quietspec4j.service.impl;

import java.util.List;

import com.cubetutor.quietspec4j.exception.QuietSpec4JException;
import com.cubetutor.quietspec4j.model.Block;
import com.cubetutor.quietspec4j.model.Fault;
import com.cubetutor.quietspec4j.service.QuietSpecHttpConnector;
import com.cubetutor.quietspec4j.service.SetsService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.google.inject.Inject;

public class SetsServiceImpl implements SetsService {

	private QuietSpecHttpConnector httpConnector;

	@Inject
	public SetsServiceImpl(QuietSpecHttpConnector httpConnector) {
		this.httpConnector = httpConnector;
	}
	
	public List<Block> getAllBlocks() throws QuietSpec4JException {
		String response = null;
		
		try {
			response = httpConnector.makeRequest("https://tradertools-prod.apigee.net/v1/sets.json");
			System.out.println(response);
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
			
			Fault value = mapper.readValue(response, Fault.class);
			System.out.println(value);
		} catch (Exception e) {
			throw new QuietSpec4JException(e);
		}
		
		return null;
	}

}
