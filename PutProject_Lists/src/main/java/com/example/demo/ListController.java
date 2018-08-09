package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {
	
	private List<String> sandwiches = new ArrayList<String>();

	public ListController() {
		sandwiches.add("BLT");
		sandwiches.add("SmorreBrod");
		sandwiches.add("Italian BMT");
		sandwiches.add("Muffeletta");
		sandwiches.add("Roast Beef");
		sandwiches.add("Tuna Melt");
	}
	
	@PutMapping("/sanwich/{index}")
	public String updateSandwich(@PathVariable int index, @RequestBody String sandwich) {
		return sandwiches.set(index, sandwich);
	}
		
	
	public List<String> getSandwiches() {
		return sandwiches;
	}

	public void setSandwiches(List<String> sandwiches) {
		this.sandwiches = sandwiches;
	}
	
	
	
}
