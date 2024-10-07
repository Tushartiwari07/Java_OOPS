package com.oops.abstraction;
interface Instagram
{
	public void login();
}
class Adminn implements Instagram
{
	public void login()
	{
		System.out.println("Admin has logged in Successfully");
	}
}
class Userr implements Instagram
{
	public void login()
	{
		System.out.println("Customer has logged in Successfully");
	}
}
class Chrome 
{
	public Instagram register(int pin)
    {
		if(pin==2927)
		{
     	   Instagram a1= new  Adminn();
		   return a1;
		}
		else
		{
	      Instagram u1 = new Userr();
	       return u1;
		}
	}
}
public class Prcatice3
{
     public static void main(String[] args)
     {
		Chrome c1 = new Chrome();
		Instagram i1=c1.register(1234);
		i1.login();
	    Instagram i2 =c1.register(2927);
	    i2.login();
		 
		 
	 }
}
