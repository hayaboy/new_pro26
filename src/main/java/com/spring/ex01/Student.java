package com.spring.ex01;

import lombok.Data;

/*@Data*/
public class Student {
	
	private int ban;
	private String name;
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
