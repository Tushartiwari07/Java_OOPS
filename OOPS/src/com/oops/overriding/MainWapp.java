package com.oops.overriding;

class WhatsappMsg1
{
	public  void msgreport()
	{
		System.out.println("Single tick");
	}
}
class WhatsappMsg2 extends WhatsappMsg1
{
	public  void msgreport()
	{
		super.msgreport();
		System.out.println("double tick");
	}
	
}
class WhatsappMsg3 extends WhatsappMsg2
{
	public  void msgreport()
	{ 
		super.msgreport();
		System.out.println("blue tick");
	}
}
public class MainWapp
{ 
	public static void main(String[] args) 
	{
	WhatsappMsg1 w1=new WhatsappMsg3();//upcasted
	w1.msgreport();
	
	}
}
