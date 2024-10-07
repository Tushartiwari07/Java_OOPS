package com.oops.casting;
class A7
{
    int a=10;
}
class B7 extends A7
{
	int b=20;
}
public class MainNonPr 
{
	public static void main(String[] args) {
		B7 b1= new B7();//subclass ref
		System.out.println(b1.a+"," +b1.b);
		A7 a1=b1;//upcasting
		// a1 is the superclass reference but pointing to subclass object it is called upcasting
		//upcasted reference(a1)
		System.out.println(a1.a);//it is a property of subclass and by using upcasted ref we can assess subclass properties 
		//even if it is pointing to subclass object
		B7 b2=(B7)a1;//downcasting
		//b2 is downcasted ref by using b2 we can assess both sub and super class properties
		System.out.println(b2.a);
		System.out.println(b2.b);
		}

}
