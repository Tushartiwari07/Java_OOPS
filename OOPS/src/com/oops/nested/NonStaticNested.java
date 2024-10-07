package com.oops.nested;
class Y
{
	int a =64;
	static int b=95;
	private int c=65;
	//non static nested class
	class Z
	{
		int d=165;
		public void test()
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}
	}

 }
public class NonStaticNested
{
	public static void main(String[] args)
	{

	       Y y1=new Y();
	       Y.Z z1= y1.new Z();
	       //OuterClass.InnerClass ref= OuterClassReferanceVaribale.new InnerClass()
	       z1.test();
			
	}
 }
