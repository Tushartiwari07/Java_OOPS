package com.oops.interface1;
interface Run2
{
	int b=100;
	public void  count();
}
interface Run3 
{
 int a=10;
 public void test();
}

public class InterfaceMain implements Run2, Run3
{
	public void test()
	{
		System.out.println("test abstract of Run 3");
	}
	public void count()
	{
		System.out.println("count abstract of Run2");
	}
	public static void main(String[] args) 
	{
	
		System.out.println(Run3.a);
		System.out.println(Run2.b);
	  InterfaceMain i1= new InterfaceMain();	
	  i1.test();
	  i1.count();
	}

}
