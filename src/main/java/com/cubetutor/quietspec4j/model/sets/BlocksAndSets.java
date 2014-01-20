package com.cubetutor.quietspec4j.model.sets;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class BlocksAndSets {

	private List<Block> blocks;
	private List<Set> sets;

	public List<Block> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<Block> blocks) {
		this.blocks = blocks;
	}

	public List<Set> getSets() {
		return sets;
	}

	public void setSets(List<Set> sets) {
		this.sets = sets;
	}
}
