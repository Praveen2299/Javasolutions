package com.oops;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Address add = new Address("line1", "line2", "chennai", 607803);
		
//		String line = add.getAdd1();
//		System.out.println(line);
//		add.setAdd1("jammu road");
//		System.out.println(add.getAdd1());
		
		//System.out.println(add.getCity());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1:");
		int a = sc.nextInt();
		System.out.println("Enter the number 2:");
		int b = sc.nextInt();
		int res = a+b;
		System.out.println("Addition:"+" "+res);
		System.out.println("Enter the city:");
		String city = sc.next();
		System.out.println(city);

	}

}
