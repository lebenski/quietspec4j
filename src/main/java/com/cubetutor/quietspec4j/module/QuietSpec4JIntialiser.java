package com.cubetutor.quietspec4j.module;

import com.cubetutor.quietspec4j.service.CardPricesService;
import com.cubetutor.quietspec4j.service.SetsService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class QuietSpec4JIntialiser {

	private Injector injector;
	
	public QuietSpec4JIntialiser(String apiKey) {
	    injector = Guice.createInjector(new QuietSpec4JModule(apiKey));
	}
	
	public SetsService getSetsService() {
		return injector.getInstance(SetsService.class);
	}
	
	public CardPricesService getCardPricesService() {
		return injector.getInstance(CardPricesService.class);
	}
	
}
