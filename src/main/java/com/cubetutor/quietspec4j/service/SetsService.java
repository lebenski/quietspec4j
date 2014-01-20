package com.cubetutor.quietspec4j.service;

import java.util.List;

import com.cubetutor.quietspec4j.exception.QuietSpec4JException;
import com.cubetutor.quietspec4j.model.Block;

public interface SetsService {

	public List<Block> getAllBlocks() throws QuietSpec4JException ;
	
}
