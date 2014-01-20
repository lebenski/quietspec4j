package com.cubetutor.quietspec4j.service.impl;

import java.util.List;

import com.cubetutor.quietspec4j.model.Block;
import com.cubetutor.quietspec4j.service.SetsService;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class SetsServiceImpl implements SetsService {


	private String apiKey;

	@Inject
	public SetsServiceImpl(@Named("api.key") String apiKey) {
		this.apiKey = apiKey;
	}
	
	public List<Block> getAllBlocks() {
		System.out.println(apiKey);
		return null;
	}

}
