package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {
	
	private String[] myArray = {"apple", "mine", "sloth","sandwich", "pineapple"};
	
	private List<String> myArrayList = new ArrayList<String>();
	
	
	public ListController() {
		myArrayList.add("giraffe");
		myArrayList.add("elephant");
		myArrayList.add("dog");
		myArrayList.add("sphix");
		myArrayList.add("wolf");
		myArrayList.add("cougar");
	}
	
	@GetMapping("/array")
	public String[] getArray() {
		return this.myArray;
	}
	
	@GetMapping("/array/{index}")
	public String getArrayItem(@PathVariable int index) {
		return myArray[index];
	}
	
	@GetMapping("/list")
	public List<String> getList(){
		return this.myArrayList;
	}
	
	@GetMapping("/list/{index}")
	public String getListItem(@PathVariable int index) {
		return myArrayList.get(index);
	}
		
	

}
