package com.oops.interface1;
class A
{
	int c=50;
}
interface Run
{
	int b=100;
}
interface Run1
{
	int a='A';
}

public class Main extends A implements Run,Run1
{
	public static void main(String[] args) 
	{
	
		System.out.println(Run.b);
		System.out.println(Run1.a);
		A a1=new A();
		System.out.println(a1.c);
		
		
	}

}
