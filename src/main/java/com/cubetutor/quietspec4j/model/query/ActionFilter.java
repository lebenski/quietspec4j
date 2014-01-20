package com.cubetutor.quietspec4j.model.query;

import com.cubetutor.quietspec4j.model.prices.CardPrice;
import com.cubetutor.quietspec4j.model.prices.CardPriceAction;

public class ActionFilter implements CardPriceFilter {

	private CardPriceAction action;

	public ActionFilter(CardPriceAction action) {
		this.action = action;
	}
	
	public Boolean isMatch(CardPrice cardPrice) {
		return cardPrice.getCardPriceAction().equals(action);
	}

}
