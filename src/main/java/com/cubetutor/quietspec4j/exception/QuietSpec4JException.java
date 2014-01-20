package com.cubetutor.quietspec4j.exception;

public class QuietSpec4JException extends Throwable {

	private static final long serialVersionUID = -7167335183382770412L;
	
	public QuietSpec4JException(Throwable e) {
		super(e);
	}
	
	public QuietSpec4JException(String message) {
		super(message);
	}
}
