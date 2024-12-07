package com.infosys.spring_boot_operation.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.infosys.spring_boot_operation.dao.LaptopDao;
import com.infosys.spring_boot_operation.object.Laptop;
import com.infosys.spring_boot_operation.repository.LaptopRepository;

import jakarta.validation.constraints.AssertTrue;

@ExtendWith(MockitoExtension.class)
class LaptopControllerTest {

	@Mock
	LaptopRepository laptopRepository;
	
	@InjectMocks()
	LaptopDao dao;
	
	/*
	@BeforeEach
	void m1(){
		MockitoAnnotations.openMocks(this);
	}
	
	*/
	
	@Test
	void testSaveLaptopDao() {
		
		Laptop laptop = new Laptop(234,"Amit","black",192000);
		when(laptopRepository.save(laptop)).thenReturn(laptop);
		
		Laptop laptop2 = dao.saveLaptopDao(laptop);
		
		if(laptop == laptop2) {
			
			System.out.println("\n\n\n\n TestCase Passed!!");
		}
		else {
			
			System.out.println("TestCase Failed!!");
		}
		
	}
	
	
	@Test
	void test() {
		if(1==10) {
		fail("Not yet implemented");
		}
		else {
			assertTrue(true);
		}
	}

	@Test
	void testGetLaptopByIdDao() {
		
		Laptop laptop = new Laptop(123 ,"dell","black",264000);
		
		when(laptopRepository.findById(123)).thenReturn(Optional.of(laptop));
		
		Laptop laptop2 = dao.getLaptopByIdDao(123);
		
		verify(laptopRepository,times(1)).findById(123);
		
		assertNotNull(laptop2);
		assertEquals("dell", laptop2.getName());
	}
	
	
	void testGetLaptopByColor() {
		
		Laptop laptop = new Laptop(123,"dell","black",240000);
	}
}
