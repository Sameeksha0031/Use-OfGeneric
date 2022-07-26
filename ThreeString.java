package com.UserGenerics;

import java.util.Scanner;

public class ThreeString {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter three string");
		  String x = sc.next(); 
		  String y = sc.next(); 
		  String z = sc.next();
		  ThreeInteger obj = new ThreeInteger(x,y,z);
		  Comparable value = obj.printMax();
		  System.out.println(value+ " is the maximum value");

	}

}
