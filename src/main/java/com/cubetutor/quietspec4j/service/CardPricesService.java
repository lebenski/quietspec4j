package com.cubetutor.quietspec4j.service;

import java.util.List;

import com.cubetutor.quietspec4j.exception.QuietSpec4JException;
import com.cubetutor.quietspec4j.model.prices.CardPrice;

public interface CardPricesService {

	public List<CardPrice> getCardPrices(String cardName) throws QuietSpec4JException;
	
}
