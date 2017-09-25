package com.lambda.functionalinterfaces;
/*
* Author@ Raghavender Vodapally
* Date@ Sep 1, 2017
*/
public class UsingLambda {

	public static void main(String[] args) {
		
		MyInterface myInterface = ()-> System.out.println("Using Lambda..");
		
		//Use curly braces, if have more lines
		/*MyInterface myInterface = ()-> {
				System.out.println("more stmts");
				System.out.println("Using Lambda..");};*/	

		myInterface.method1();
		
		
		//if method has parameter
		MyInterface2 myInterface2 = (String name) -> System.out.println("your name is "+name);
		myInterface2.method2("Raghavender");
	}

}

