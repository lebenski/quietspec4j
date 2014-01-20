package com.cubetutor.quietspec4j.model.sets;

import java.util.Date;

public class Set {

	private String name;
	private String setCode;
	private String setSymbol;
	private Integer blockId;
	private Date releaseDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSetCode() {
		return setCode;
	}
	public void setSetCode(String setCode) {
		this.setCode = setCode;
	}
	public String getSetSymbol() {
		return setSymbol;
	}
	public void setSetSymbol(String setSymbol) {
		this.setSymbol = setSymbol;
	}
	public Integer getBlockId() {
		return blockId;
	}
	public void setBlockId(Integer blockId) {
		this.blockId = blockId;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
}
