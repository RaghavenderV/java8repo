package com.vtech.sort;
/*
* Author@ Raghavender Vodapally
* Date@ Sep 1, 2017
*/
public class Student implements Comparable<Student>{
	private int age;
	private String name;
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.name.compareTo(s.name);
	}
	
	@Override
	public String toString() {
		
		return "Name: "+this.name +" Age: "+this.age;
	}
	
	

}

