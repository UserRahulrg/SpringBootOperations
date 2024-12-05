package com.infosys.spring_boot_operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import com.infosys.spring_boot_operation.dao.LaptopDao;
import com.infosys.spring_boot_operation.object.Laptop;
import com.infosys.spring_boot_operation.repository.LaptopRepository;

/* Notes
 * 
 * @RestControllerAdvice
 * nativeQuery,jpql query
 * @RestController
 * @Query
 * 
 * */

@RestController
@CrossOrigin(origins="http://localhost:5173")
@RequestMapping(value="laptopController")
public class LaptopController {
	
	@Autowired
	LaptopRepository laptopRepository;
	
	@PostMapping(value="/saveLaptops")
	public Laptop saveLaptopControllers(@RequestBody Laptop laptop) {
		
		System.out.println(laptop);
		return laptop;
	
}
	
	@Autowired
	LaptopDao laptopDao;
	
	@PostMapping("/saveLaptop" /*method=Request.GET*/)
	public Laptop saveLaptopController(@RequestBody Laptop laptop) {
		
		return laptopDao.saveLaptopDao(laptop);
	}
	
	@PostMapping(value="/getLaptopById/{a}")
	public Laptop getLaptopByIdController(@PathVariable("a") Integer id) {
		
		return laptopDao.getLaptopByIdDao(id);
	}
	
	@GetMapping(value="/getAllLaptop")
	public List<Laptop> getAllLaptopController(){
		
		return laptopRepository.findAll();
	}
	
	@DeleteMapping(value="/deleteLaptop")
	public boolean deleteLatopByIdController(Integer id) {
		
		Laptop laptop = getLaptopByIdDao(id);
		
		String color ="silver";
		if(laptop!=null) {
			laptop.setColor(color);
			laptopRepository.save(laptop);
		}
		return true;
	}

	private Laptop getLaptopByIdDao(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

//	public Laptop getLaptopByColor() {
//		
//		Laptop laptop;
//		return laptop;
//	}
//	
	
	
	@GetMapping(value="/getByColor/{color}")
	public List<Laptop> getLaptopByColorController(@PathVariable String color){
		
		List<Laptop> laptops = laptopDao.getLaptopByColor(color);
		
		if(!(laptops.isEmpty())) {
			
			return laptops;
		}
		else {
			return null;
		}
	}
	
	
	@GetMapping(value="/getByPrice/{price}")
	public List <Laptop> sortLaptopbypriceHighToLowController(String price){
		
		return laptopDao.sortLaptopByPriceHighToLowDao(price);
	}
	
	@GetMapping(value="/getLaptopByPagination/{pagesize}/{pagenumber}")
	public Page<Laptop> displayLaptopByPaginationDao(@PathVariable int pagesize,@PathVariable int pagenumber){
		
		return laptopDao.displayPageByPaginationDao(pagesize, pagenumber);
	}
	
	/*
	@PutMapping(value="/")
	public 
	*/
}
