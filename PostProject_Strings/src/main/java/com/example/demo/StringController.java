package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

	private String sentence = "";
	
	@PostMapping("/sentence/{word}")
	public String addWord(@PathVariable String word) {
		this.sentence += word + " ";
		return sentence;
	}
	
	@PostMapping("/sentence/overwrite/{word}")
	public String overwriteWord(@PathVariable String word) {
		this.sentence = word;
		return sentence;
	}
	
	@PostMapping("/sentence")
	public String addWordFromBody(@RequestBody String word) {
		this.sentence += word + " ";
		return sentence;
	}
	
	@PostMapping("/sentence/overwrite")
	public String overwriteWordFromBody(@RequestBody String word) {
		this.sentence = word;
		return sentence;
	}
}
