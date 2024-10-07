package com.oops.nested;
class A
{
   int a= 90;
   static int b=80;
   private int c=70;
   static class B
   {
	   A a2= new A();
	   int a1=77;
	   public void test()
	   {
		   System.out.println(a1);
		   System.out.println(a2.a);
		   System.out.println(b);
		   System.out.println(a2.c);
	   }
   }
}
public class StaticNested
{
	public static void main(String[] args)
	{
		A.B b1= new A.B();
		b1.test();
		
	}
}
