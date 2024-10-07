package com.oops.casting;

public class Primitive 
{
public static void main(String[] args) {
	int a=10;
	double b=a;
	System.out.println(b); //widening]
	
	double b1=89.979;
	int a1= (int)b1;
	System.out.println(a1);//narrowing
	
	float f1=867.98f;
	int a2=(int)f1;
	System.out.println(a2);
	
}
}
