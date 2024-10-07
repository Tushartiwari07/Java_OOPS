package com.oops.casting;
class A1
{
	
}
class B1 extends A1
{
	
}
public class CastException {
public static void main(String[] args) {
	A a1=new A();
	B b1=(b)a1;//classcastexception because downcasting without uocasting
}
}
