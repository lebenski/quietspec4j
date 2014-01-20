package com.cubetutor.quietspec4j.model.query;

import com.cubetutor.quietspec4j.model.prices.CardPrice;

public class MerchantNameFilter implements CardPriceFilter {

	private String merchantName;

	private MerchantNameFilter(String merchantName) {
		this.merchantName = merchantName;
	}
	
	public Boolean isMatch(CardPrice cardPrice) {
		return cardPrice.getMerchantName().equals(merchantName);
	}

}
