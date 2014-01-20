package com.cubetutor.quietspec4j.service;

import com.cubetutor.quietspec4j.exception.QuietSpec4JException;
import com.cubetutor.quietspec4j.model.BlocksAndSets;

public interface SetsService {

	public BlocksAndSets getAllBlocksAndSets() throws QuietSpec4JException ;
	
}
