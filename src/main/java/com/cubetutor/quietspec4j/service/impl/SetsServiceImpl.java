package com.cubetutor.quietspec4j.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.cubetutor.quietspec4j.exception.QuietSpec4JException;
import com.cubetutor.quietspec4j.model.BlocksAndSets;
import com.cubetutor.quietspec4j.service.QuietSpecHttpConnector;
import com.cubetutor.quietspec4j.service.SetsService;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;

public class SetsServiceImpl implements SetsService {

	private QuietSpecHttpConnector httpConnector;

	@Inject
	public SetsServiceImpl(QuietSpecHttpConnector httpConnector) {
		this.httpConnector = httpConnector;
	}
	
	public BlocksAndSets getAllBlocksAndSets() throws QuietSpec4JException {
		String response = null;
		
		try {
			response = httpConnector.makeRequest("https://tradertools-prod.apigee.net/v1/sets.json");
			ObjectMapper mapper = new ObjectMapper();
			
			DateFormat releaseDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			mapper.getDeserializationConfig().with(releaseDateFormat);
			BlocksAndSets blocksAndSets = mapper.readValue(response, BlocksAndSets.class);
			System.out.println(mapper.writeValueAsString(blocksAndSets));
			return blocksAndSets;
		} catch (Exception e) {
			throw new QuietSpec4JException(e);
		}
	}

}
