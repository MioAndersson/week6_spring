package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjectController {
	
	private Thingy thing;
	@PostMapping("/thing")
	public Thingy newThingy(@RequestBody Thingy thing) {
		this.thing = thing;
		return thing;
	}

}

class Thingy{
	private int id;
	private String name;
	private boolean wobbles;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isWobbles() {
		return wobbles;
	}
	public void setWobbles(boolean wobbles) {
		this.wobbles = wobbles;
	}
	
}