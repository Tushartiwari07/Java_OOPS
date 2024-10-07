package com.oops.constructor;

public class Demo 
{
public static void test()
{
	System.out.println( "test()");
}
protected String test(int a)
{
	return "test(int)";
}
public static void main(String[] args) {
	test();
	Demo d1 = new Demo();
	System.out.println(d1.test(5));
}
}
