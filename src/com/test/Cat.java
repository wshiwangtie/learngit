package com.test;

public class Cat {
	public String name;
	public Cat() {
		System.out.println("���췽��");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
}
