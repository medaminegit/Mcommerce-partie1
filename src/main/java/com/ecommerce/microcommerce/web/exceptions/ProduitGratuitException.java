package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class ProduitGratuitException extends Throwable {

	public ProduitGratuitException(String message)
	{
		super(message);
	}
}
