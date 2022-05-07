package com.capg.Exception;

import javax.management.RuntimeErrorException;



public class ResourceNotFoundException extends RuntimeErrorException {
	private static final long serialVersionUID = 1L;
	public ResourceNotFoundException(Error message) {
		super(message);
	}

}
