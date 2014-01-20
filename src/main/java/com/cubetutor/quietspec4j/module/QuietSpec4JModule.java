package com.cubetutor.quietspec4j.module;

import java.util.HashMap;
import java.util.Map;

import com.cubetutor.quietspec4j.service.SetsService;
import com.cubetutor.quietspec4j.service.impl.SetsServiceImpl;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class QuietSpec4JModule extends AbstractModule  {

	private String apiKey;

	public QuietSpec4JModule(String apiKey) {
		this.apiKey = apiKey;
	}
	
	@Override
	protected void configure() {
	    bindProperties();
	    bind(SetsService.class).to(SetsServiceImpl.class);
	}

	private void bindProperties() {
		Map<String, String> properties = new HashMap<String, String>();
	    properties.put("api.key", apiKey);
		Names.bindProperties(binder(), properties);
	}

}
