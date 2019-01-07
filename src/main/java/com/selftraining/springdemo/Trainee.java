package com.selftraining.springdemo;

import org.springframework.stereotype.Component;

@Component("trainee")
public class Trainee {

	
	private int id = 10;
	
	private String name = "Default Name";

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
	
	
}
