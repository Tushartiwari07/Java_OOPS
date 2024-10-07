package com.oops.poly;
//Method Overloading
class Person
{
	public void tushar(int home)
	{
	System.out.println("Son");	
	} 
	public void tushar(double Qsp)
	{
		System.out.println("Student");
	}
	public void tushar(String shop)
	{
		System.out.println("Customer");
	}
	
}
public class CompileTime 
{
	public static void main(String[] args) 
	{
	Person p1=new Person();
	p1.tushar(16);
	p1.tushar(0.7);
	p1.tushar("...");
}

}
