package com.UserGenerics;

import java.util.Scanner;

public class AllinOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter three number");
		  Integer fno = sc.nextInt(); 
		  Integer sno = sc.nextInt(); 
		  Integer thno = sc.nextInt();
		  ThreeInteger integer = new  ThreeInteger(fno,sno,thno);
		  Comparable valueOne = integer.printMax();
		  System.out.println(valueOne+ " is the maximum value");
		  
		  System.out.println("Enter three floating number");
		  Double fdouble = sc.nextDouble(); 
		  Double sdouble = sc.nextDouble(); 
		  Double thdouble = sc.nextDouble();
		  ThreeInteger objDouble = new  ThreeInteger(fdouble,sdouble,thdouble);
		  Comparable valueTwo = objDouble.printMax();
		  System.out.println(valueTwo+ " is the maximum value");
		  
		  System.out.println("Enter three String");
		  String fString = sc.next(); 
		  String sString = sc.next(); 
		  String thString = sc.next();
		  ThreeInteger objString = new  ThreeInteger(fString,sString,thString);
		  Comparable valueThree = objString.printMax();
		  System.out.println(valueThree+ " is the maximum value");

	}

}
