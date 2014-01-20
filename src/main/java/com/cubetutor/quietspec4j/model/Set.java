package com.cubetutor.quietspec4j.model;

public class Set {

	private String name;
	private String releaseDate;
	private String setCode;
	private String setSymbol;
	private Integer blockId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
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
}
