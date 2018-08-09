package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VariableController {
	private String myName = "Love";
	private int myNumber = 13;
	private boolean isTrue = true;
	private double myNumberTwo = 3.14;
	private float myNumberThree = 56f;

	
	@GetMapping("/name")
	public String getName() {
		return this.myName;
	}
	
	@GetMapping("/number")
	public int getNumber() {
		return this.myNumber;
	}
	
	@GetMapping("/true")
	public boolean getBool() {
		return this.isTrue;
	}
	
	@GetMapping("/pi")
	public double getPi() {
		return this.myNumberTwo;
	}
	
	@GetMapping("/float")
	public float getFloat(){
		return this.myNumberThree;
	}
}
