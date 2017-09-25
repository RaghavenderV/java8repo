package com.vtech.sort;
/*
* Author@ Raghavender Vodapally
* Date@ Sep 1, 2017
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CustomSortUsingLambda {
	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student(10, "tippu"));
		stuList.add(new Student(25, "sam"));
		stuList.add(new Student(60, "aryan"));
		stuList.add(new Student(56, "bindu"));
		
		stuList.forEach(new MyConsumer());
		
		//another way
		System.out.println("--------------------------------------");
		System.out.println("other way");
		stuList.forEach((s)-> System.out.println(s));
	}
	
	

}

class MyConsumer implements Consumer<Student>{

	@Override
	public void accept(Student s) {
		System.out.println(s);
		
	}
	
}

