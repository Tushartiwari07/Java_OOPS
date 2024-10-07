package com.oops.overriding;
class Father
{
  public  void bike()
  {
	  System.out.println("Royal enfield");
  }
}
class Son extends Father
{
	 public void bike()
	 {
		System.out.println("modified bullet");
	 }
}
public class Example 
{
public static void main(String[] args)
{
	Father f1=new Son();
	f1.bike();
}
}
