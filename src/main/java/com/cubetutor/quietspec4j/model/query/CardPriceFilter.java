package com.cubetutor.quietspec4j.model.query;

import com.cubetutor.quietspec4j.model.prices.CardPrice;

public interface CardPriceFilter {

	public Boolean isMatch(CardPrice cardPrice);
	
}
