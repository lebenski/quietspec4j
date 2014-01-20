package com.cubetutor.quietspec4j.model.prices;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CardPriceAction {
	BUY("buy"), SELL("sell");
	
	private final String jsonVersion;

	private CardPriceAction(String jsonVersion) {
		this.jsonVersion = jsonVersion;
	}

	@JsonValue
	public String getJsonVersion() {
		return jsonVersion;
	}

	@JsonCreator
    public static CardPriceAction create(String val) {
		for(CardPriceAction action : CardPriceAction.values()) {
			if(action.getJsonVersion().equals(val)) {
				return action;
			}
		}
		return null;
    }
}
