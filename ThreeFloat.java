package com.UserGenerics;

import java.util.Scanner;

public class ThreeFloat{
	
	/*private double x ,y,z;
	
	public ThreeFloat(double x,double  y, double z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
	}*/

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter three number");
		  Double x = sc.nextDouble(); 
		  Double y = sc.nextDouble(); 
		  Double z = sc.nextDouble();
		  ThreeInteger obj = new ThreeInteger(x,y,z);
		  Comparable value = obj.printMax();
		  System.out.println(value+ " is the maximum value");

	}

}
