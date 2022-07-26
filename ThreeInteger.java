package com.UserGenerics;
import java.util.Scanner;

public class ThreeInteger<E extends Comparable<E>> {  //E refer to a type
	
	private E x , y, z;
	public ThreeInteger(E x, E y, E z) {
	this.x = x;
	this.y = y;
	this.z = z;
    }
	
	public E printMax() {
		E max = x;
		if(y.compareTo(max) > 0) {
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max = z;
		}
		return max;
		
	}
  
public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter three number");
	  Integer x = sc.nextInt(); 
	  Integer y = sc.nextInt(); 
	  Integer z = sc.nextInt();
	  ThreeInteger integer = new  ThreeInteger(x,y,z);
	  Comparable value = integer.printMax();
	  System.out.println(value+ " is the maximum value");
	  
	}

}
