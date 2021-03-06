package com.morningstar.lossaversion.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LossAversionCutomException extends RuntimeException {
	
	private HttpStatus httpStatus;
	private String message;
	
}
