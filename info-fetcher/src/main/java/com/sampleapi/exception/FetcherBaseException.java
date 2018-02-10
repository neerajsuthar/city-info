package com.sampleapi.exception;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class FetcherBaseException extends Exception {
	
	private static final long serialVersionUID = -8392359619303137314L;

	public FetcherBaseException(String errorCode, String errorMessage) {
		super(MessageFormat.format(bundle.getString(errorCode), errorMessage));
		
		String excpDetails = MessageFormat.format(bundle.getString(errorCode), errorMessage);
		
		System.err.println(excpDetails);
	}
	
	private static ResourceBundle bundle = ResourceBundle.getBundle("bundles.errors");
}
