package com.oops.casting;
class A9
{
	
}
class B9  extends A9
{
	
}
class C9 extends A9
{
	
}
public class TestMain
{
   public static void test(A9 ref)
   {
	   System.out.println("A ref="+ ref);
   }
   public static void test(B9 ref)
   {
	   System.out.println("B ref="+ ref);
   }
  public static void main(String[] args)
  {
	test(new A9());
	test(new B9());
	test(new C9());
 }
}
