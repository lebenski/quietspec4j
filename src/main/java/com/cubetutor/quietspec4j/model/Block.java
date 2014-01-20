package com.cubetutor.quietspec4j.model;

public class Block {
	
	private Integer name;
	private Integer id;
	
	public Block(Integer name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	public Integer getName() {
		return name;
	}

	public void setName(Integer name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
