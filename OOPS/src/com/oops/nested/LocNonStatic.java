package com.oops.nested;

class Abc
{
	public void test()
	{
		class Xyz
		{
			public void count()
			{
			 System.out.println("count() of XYZ");
			}
		}
		//local class can be assessed only by the methods in which it is declared
		Xyz x1= new Xyz();
		x1.count();
	}
}
public class LocNonStatic
{
       public static void main(String[] args) 
    {
	Abc a1= new Abc();
	a1.test();
   }
}
