package com.prowigs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowigs.model.Animal;

@RestController
public class HelloController {
	
	
	@GetMapping("/hello")
	public String hello() {
		return "hello.............";
	}
	
	
	@GetMapping("/animal")
	public Animal getAnimal() {
		
		Animal a1= new Animal();
		a1.setId(1);
		a1.setCatagory("dog");
		return a1;
		
//		return  new Animal(2, "cat");
	}
	
	@GetMapping("/animalList")
	public List<Animal> getAllAnimals(){
		ArrayList<Animal> al1= new ArrayList<>();
		
		al1.add(new Animal(3,"rat"));
		al1.add(new Animal(4,"aaa"));	
		al1.add(new Animal(5,"bbb"));
		return al1;
	}
	
	
}