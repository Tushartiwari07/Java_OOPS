package com.oops.casting;
// with relation how to take a return object
class a
{
	
}
class b extends a
{
	
}
class c extends a
{
	
}
public class Main
{

	public a test(a e2)
	{
		return e2;
	}
public static void main(String[] args) 
{
	Main m1=new Main();
	System.out.println(m1.test(new a()));
	System.out.println(m1.test(new b()));
	System.out.println(m1.test(new c()));
	

}
}
