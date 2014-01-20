package com.cubetutor.quietspec4j.service;

import java.util.List;

import com.cubetutor.quietspec4j.exception.QuietSpec4JException;
import com.cubetutor.quietspec4j.model.prices.CardPrice;
import com.cubetutor.quietspec4j.model.query.CardPriceFilter;

public interface CardPricesService {

	public List<CardPrice> getCardPrices(String cardName) throws QuietSpec4JException;
	public List<CardPrice> getCardPrices(String cardName, List<CardPriceFilter> filters) throws QuietSpec4JException;
	
}
