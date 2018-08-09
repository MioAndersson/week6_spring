package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
	
	private List<String> colors = new ArrayList<String>();
	
	public StringController() {
		colors.add("Blue");
		colors.add("Groot");
		colors.add("Purple");
		colors.add("Gold");
		colors.add("Green");
		colors.add("Silver");
	}
	
	@DeleteMapping("/color/{index}")
	public boolean removeColor(@PathVariable int index) {
		try {
			this.colors.remove(index);
			return true;
		}catch(IndexOutOfBoundsException ex){
			return false;
		}
	}

}
