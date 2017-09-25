package com.lambda.functionalinterfaces;
/*
* Author@ Raghavender Vodapally
* Date@ Sep 1, 2017
*/
public class TraditionalTest {

	public static void main(String[] args) {
		
		// this is the traditional way
		MyInterface myInterface = new MyInterface() {
			
			@Override
			public void method1() {
				System.out.println("Anonymous class..");
				
			}
		};
		
		myInterface.method1();

	}

}

