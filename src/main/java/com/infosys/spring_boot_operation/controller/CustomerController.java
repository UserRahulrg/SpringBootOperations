package com.infosys.spring_boot_operation.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.spring_boot_operation.object.Laptop;

@RestController
public class CustomerController {

	@GetMapping(value="/TodayDayAndTime")
	public static String getTodayDayAndTime() {
			System.out.println("DateAndTime Function");
		return LocalDateTime.now()+"  The Clock";
	}
	
	@GetMapping(value="/additionOfTwoNumber/{a}/{b}")
	public String additionOfTwoNumber(@PathVariable int a, @PathVariable int b) {
		
		return "addition of a and b "+(a+b);
	}
	
	@PostMapping(value="/saveLaptop2")
	public Laptop saveLaptopController(@RequestBody Laptop laptop) {
		
		System.out.println(laptop);
		return laptop;
		
		
	}
	
	@GetMapping(value="/saveLaptop3")
	public String Laptops() {
	
		Laptop ls = new Laptop();
		return ""+ls;
	}
	
	@GetMapping(value="/MyPages")
	public String getXmlContext() throws IOException
	{
		
		ClassPathResource resource = new ClassPathResource("NewFile.xml");
		
		return StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
	}
	
	
}
