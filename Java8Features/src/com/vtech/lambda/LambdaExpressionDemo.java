package com.vtech.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
* Author@ Raghavender Vodapally
* Date@ Sep 1, 2017
*/
public class LambdaExpressionDemo {

	public static void main(String[] args) {
		
		
		List<String> namesList =new ArrayList<>();
		namesList.add("Raghu");
		namesList.add("Abhinav");
		namesList.add("Rajesh");
		namesList.add("Malli");
		namesList.add("GIT First Push");
		namesList.add("GIT second Push");
		namesList.add("change from remote GIT");
		
		// code-1,2,3,4 returns same output and exactly same. simplified versions
		
		//code-1
		/*namesList.forEach(new Consumer<String>() {

			@Override
			public void accept(String name) {
				System.out.println(name);
				
			}
		});*/
		
		//code-2 - yet siplified
		//namesList.forEach((String name) -> System.out.println(name));
		
		//code-3 - yet siplified
		//namesList.forEach((name) -> System.out.println(name));
		
		//code-4
		namesList.forEach(System.out::println);
		
		
		
		System.out.println("-----------------------------------------");
		//createThreadUsingAnonymousClass();
		createThreadUsingLambdaExpression();
		

	}

	//same functionality
	private static void createThreadUsingLambdaExpression() {
		Runnable r1 = () -> {System.out.println("from Lambda..");};
		Thread t = new Thread(r1);
		t.start();
		
	}

	/*private static void createThreadUsingAnonymousClass() {
		
		// this is one of the ways to create thread
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("task is executing : AnonymousClass");
				
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	}*/

}

