package com.infosys.spring_boot_operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.infosys.spring_boot_operation.controller")
@ComponentScan("com.infosys.spring_boot_operation.object")
@ComponentScan("com.infosys.spring_boot_operation.Service")
@ComponentScan("com.infosys.spring_boot_operation.dao")
@ComponentScan("com.infosys.spring_boot_operation.Response.ResponseStructure")
@SpringBootApplication
public class SpringBootOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOperationApplication.class, args);
	}
	
//	public static String TwoNumber() {
//		
//		
//		return "";
//	}
	
}
