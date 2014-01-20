package com.cubetutor.quietspec4j.service.impl;

import static ch.lambdaj.Lambda.filter;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import ch.lambdaj.function.matcher.LambdaJMatcher;
import ch.lambdaj.function.matcher.Predicate;

import com.cubetutor.quietspec4j.exception.QuietSpec4JException;
import com.cubetutor.quietspec4j.model.prices.CardPrice;
import com.cubetutor.quietspec4j.model.query.CardPriceFilter;
import com.cubetutor.quietspec4j.service.CardPricesService;
import com.cubetutor.quietspec4j.service.QuietSpecHttpConnector;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;

public class CardPricesServiceImpl implements CardPricesService {

	private QuietSpecHttpConnector httpConnector;

	@Inject
	public CardPricesServiceImpl(QuietSpecHttpConnector httpConnector) {
		this.httpConnector = httpConnector;
	}
	
	public List<CardPrice> getCardPrices(String cardName) throws QuietSpec4JException{
		String response = null;
		
		try {
			response = httpConnector.makeRequest(getUrl(cardName));
			ObjectMapper mapper = new ObjectMapper();
			
			List<CardPrice> cardPrices = mapper.readValue(response, new TypeReference<List<CardPrice>>(){});
			System.out.println(mapper.writeValueAsString(cardPrices));
			return cardPrices;
		} catch (Exception e) {
			throw new QuietSpec4JException(e);
		}
	}

	private String getUrl(String cardName) throws UnsupportedEncodingException {
		return "https://tradertools-prod.apigee.net/v1/cards/"+URLEncoder.encode(cardName,"UTF-8").replace("+", "%20")+"/prices.json";
	}

	public List<CardPrice> getCardPrices(String cardName, final List<CardPriceFilter> filters) throws QuietSpec4JException {
		List<CardPrice> cardPrices = getCardPrices(cardName);
		
		LambdaJMatcher<CardPrice> cardPriceMatcher = new Predicate<CardPrice>() {
	        public boolean apply(CardPrice item) {
	        	for(CardPriceFilter filter : filters) {
	        		if(!filter.isMatch(item)) {
	        			return false;
	        		}
	        	}
	        	
	        	return true;
	        }
		};
		
		return filter(cardPriceMatcher, cardPrices);
	}

}
