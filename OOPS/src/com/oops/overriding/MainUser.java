package com.oops.overriding;

abstract class Account
{
	long accno;
	double bal;
	String owner;
	 public void deposit(double amt)
	{
		if(amt>=0)
		{
			bal=bal+amt;
			System.out.println("curren bal="+ bal);
		}
		else 
		{
			System.out.println("invalid transaction");
		}
	}
	public void withdraw(double amt)
	{ 
     if(amt>=0&& bal>=amt)
     {
    	 bal=bal-amt;
    	 System.out.println("current bal=" + bal);
     }
     else
     {
    	 System.out.println("insufficient bal");
     }
	}
}
	class Saving extends Account
	{
		
		double roi=0.10;
		public void calculateroi()
		{
			bal=bal+bal*roi;
			System.out.println("with interest"+ bal);
		}
	}
	class current extends Account
	{
		double minbal=5000.0;
		public void withdraw(double amt)
		{
			if(amt>=0&& bal-5000.0>=amt)
			{
		    	 bal=bal-amt;
		    	 System.out.println("current bal=" + bal);
		     }
		     else
		     {
		    	 System.out.println("insufficient bal");
		     }
	
		}
	
		public void showMinbal()
		{
			System.out.println("min bal=" + minbal);
		}
}
 public class MainUser
	{
		public static void main(String[] args)
		{
			Saving s1=new Saving();
			s1.deposit(10000.0);
			s1.withdraw(5000.0);
			s1.calculateroi();
			
		 current c1=new current();
		         c1.deposit(10000.00);
		        c1.withdraw(5001.00);
			
		}
	}


