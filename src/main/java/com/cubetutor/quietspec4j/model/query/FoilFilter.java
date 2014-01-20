package com.cubetutor.quietspec4j.model.query;

import com.cubetutor.quietspec4j.model.prices.CardPrice;

public class FoilFilter implements CardPriceFilter {

	private Boolean isFoil;

	public FoilFilter(Boolean isFoil) {
		this.isFoil = isFoil;
	}
	
	public Boolean isMatch(CardPrice cardPrice) {
		return cardPrice.getFoil().equals(isFoil);
	}

}
