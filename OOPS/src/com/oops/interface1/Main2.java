package com.oops.interface1;
interface Run5
{
	int a='t';
	void test();
}
public class Main2 
{
  public void test()
  {
	  System.out.println("test() of abstract interface class is overridden ");
  }
  public static void main(String[] args) 
  {
	System.out.println(Run5.a);
	Run5 r5;
	Main2 m2= new Main2();
	m2.test();			
}
}
