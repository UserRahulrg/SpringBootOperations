package com.infosys.spring_boot_operation.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.infosys.spring_boot_operation.Response.ResponseStructure;
import com.infosys.spring_boot_operation.dao.LaptopDao;
import com.infosys.spring_boot_operation.object.Laptop;

import lombok.Data;

@Service
@Data
public class LaptopService {

	private LaptopDao dao;
	
	//@Autowired
	private ResponseStructure<Laptop> responseStructure;
	
	public ResponseStructure<Laptop> saveLaptopService(Laptop laptop)
	{
		
		Laptop laptop2 = dao.saveLaptopDao(laptop);
		
		if(laptop2 != null) {
			responseStructure.setStatus((HttpStatus.CREATED.value()));;
			responseStructure.setDescription("save Method !!");
			responseStructure.setMessage("Data Stored!!");
			responseStructure.setData(laptop2);
			return responseStructure;
		}
		else {
			responseStructure.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
			responseStructure.setDescription("Save Method!!");
			responseStructure.setMessage("Data Not Stored!!");
			responseStructure.setData(laptop2);
			return responseStructure;
		}
	}
	
}
