package com.oops.abstraction;
interface User1
{
	public void transfer();
}
class ATM implements User1
{
	public void transfer()
	{
		System.out.println("transfer of ATM");
	}
}
class Web implements User1
{
	public void transfer()
	{
		System.out.println("transfer of Web");
	}
}
class Transctions
{
	User1 u1;
	public User1 CreateObject(int pin)
	{
		if(pin==1234)
		{
			u1=new ATM();
			return u1;
		}
		else
		{
			u1=new Web();
			return u1;
		}
	}
}

public class BankMain
{
      public static void main(String[] args) 
      {
		Transctions t1=new Transctions();
		User1 u1=t1.CreateObject(1234);
		u1.transfer();
		System.out.println("-------------");
		User1 u2=t1.CreateObject(4321);
		u2.transfer();
		
		
	}
}
