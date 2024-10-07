package com.oops.abstract1;
abstract class TesT
{
	abstract public void test();

public void test1()
{
	System.out.println("non-static concrete test1()");
}
public static void test2()
{
	System.out.println("Static concrete test2()");
}
}
class a extends TesT
{
	@Override
	public  void test()
	{ 
		System.out.println("overiding abstract method");
	}
	public void test1()
	{
		System.out.println("non-static concrete test1()");
	}
	public static void test2()
	{
		System.out.println("Static concrete test2()");
	}
}

public class Demo
{
	public static void main(String[] args)
	{
	   a a1= new a();
	   a1.test();
	   a1.test1();
	   a.test2();
	}
}