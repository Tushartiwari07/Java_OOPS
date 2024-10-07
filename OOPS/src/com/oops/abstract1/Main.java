package com.oops.abstract1;
abstract class demo1
{
	abstract public void test();

	
	}
class Child extends demo1
{
	@Override
	public void test()
	{
		System.out.println("test of ABSTRACT class is overridden");
	}
}

public class Main 
{
	public static void main(String[] args)
	{
		Child c1= new Child();
		c1.test();
		
	}

}
