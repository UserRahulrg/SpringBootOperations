package com.infosys.spring_boot_operation.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Repository;

import com.infosys.spring_boot_operation.object.Laptop;
import com.infosys.spring_boot_operation.repository.LaptopRepository;

@Repository
public class LaptopDao {

	@Autowired
	LaptopRepository laptopRepository;
	
	public Laptop saveLaptopDao(Laptop laptop) {
		
		return laptopRepository.save(laptop);
	}
	
	public Laptop getLaptopByIdDao(Integer id) {
		
		Optional<Laptop> optional = laptopRepository.findById(id);
		
		return optional.isPresent()?optional.get():null;
	}
	
	public List<Laptop> getAllLaptop(){
		
		return laptopRepository.findAll();
	}
	
	
	
	public boolean deleteLaptopById(Integer id) {
		
		Laptop laptop = getLaptopByIdDao(id);
		if(laptop!=null){
			laptopRepository.delete(laptop);
		
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean updateLaptopById() {
		
		return true;
	}
	
	public boolean updatelaptopByColorByIddao(Integer id, String color) {
		
		Laptop laptop = getLaptopByIdDao(id);
		
		if(laptop != null) {
			laptop.setColor(color);
			laptopRepository.save(laptop);
			return true;
		}
		else {
			return false;
		}
	}
	
	public List<Laptop> getLaptopByColor(String color){
		
		return laptopRepository.findByColor(color);
	}
	
	public List<Laptop> sortLaptopByPriceHighToLowDao(String price){
		
		return laptopRepository.findAll(Sort.by(Direction.DESC,price));
	}
	
	public Page<Laptop> displayPageByPaginationDao(int pagesize,int pagenumber){
		
		return laptopRepository.findAll(PageRequest.of(pagenumber, pagesize));
	}
	
	
}
