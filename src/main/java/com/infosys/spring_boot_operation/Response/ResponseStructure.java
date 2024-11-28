package com.infosys.spring_boot_operation.Response;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ResponseStructure<T> {

	private int status;
	private String description;
	private String message;
	private T data;
	
	
	
}
