package com.cubetutor.quietspec4j.model.prices;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CardPrice {
	
	private CardPriceAction cardPriceAction;
	private String cardName;
	private Integer id;
	private Boolean foil;
	private String merchantName;
	private BigDecimal price;
	private String setName;
	private Timestamp updatedAt;
	private Long gathererId;
	private String notes;
	private Integer volume;
	private Long inventoryId;
	private Long productId;
	
	public CardPriceAction getCardPriceAction() {
		return cardPriceAction;
	}
	@JsonProperty("action")
	public void setCardPriceAction(CardPriceAction cardPriceAction) {
		this.cardPriceAction = cardPriceAction;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getFoil() {
		return foil;
	}
	public void setFoil(Boolean foil) {
		this.foil = foil;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getSetName() {
		return setName;
	}
	public void setSetName(String setName) {
		this.setName = setName;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Long getGathererId() {
		return gathererId;
	}
	public void setGathererId(Long gathererId) {
		this.gathererId = gathererId;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Integer getVolume() {
		return volume;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	public Long getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
}
