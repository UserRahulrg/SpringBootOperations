package com.infosys.spring_boot_operation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infosys.spring_boot_operation.object.Laptop;

public interface ProductRepository extends JpaRepository<Laptop, Integer> {

	//@Query("SELECT p FROM Product p WHERE p.color = :color")
	//List<Laptop> findByColor(@Param("color") String color);
}





