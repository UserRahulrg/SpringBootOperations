package com.infosys.spring_boot_operation.object;

import java.io.Serializable;

import org.springframework.stereotype.Component;

//import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Component
public class Laptop implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	//@JsonProperty(value="id")
	private int id;
	private String name;
	private String color;
	private int price;
	
	
}
