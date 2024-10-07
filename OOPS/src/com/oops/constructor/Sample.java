package com.oops.constructor;

import javax.swing.text.StyleContext.SmallAttributeSet;
//constructor over loading......
public class Sample
{
	public Sample()
	{
		System.out.println("sample()");
	}
	public Sample(int a)
	{
		System.out.println("sample(int)"+ a);
	}
public Sample(double a)
   {
	System.out.println("sample(double)"+ a);
   }
    public Sample(int a, double b)
    {
    	System.out.println("sample(int,double)"+ a);
    }
    public Sample(double a, int b)
    {
    	System.out.println("sample(double,int)");
    }
   public static void main(String[] args) {
      new Sample();
      new Sample(24);
      new Sample(1.6);
      new Sample(7.5,65);
      new Sample(25,9.5);
}
}
