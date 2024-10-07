package com.oops.has_a_relation;
class Account

{
	long accno;
	double bal;
	String branch;
	public Account(long accno,String branch)
	{
		this.accno=accno;
		this.branch=branch;
	}
	public void deposit(double amt)
	{
		if(amt>=0)
		{
			bal=bal+amt;
			System.out.println("Current bal "+ bal);
		}
		else
		{
			System.out.println("Invalid transctiom");
		}
	}
	public void withdraw(double amt)
	{
		if(amt>=0 && bal>amt)
		{
			bal=bal-amt;
			System.out.println("bal after withdraw "+ bal);
		}
		else
		{
			System.out.println("Insufficient bal");
		}
	}
}
class Customer
{
	String name;
	long phoneno;
	Account a1;
	public Customer(String name,long phoneno,Account a1)
	{
		this.name=name;
		this.phoneno=phoneno;
		this.a1=a1;
	}
	public void deposittoAccount(double amt)
	{
		a1.deposit(amt);
	}
	public void WithdrawfromAcount(double amt)
	{
		a1.withdraw(amt);
	}
}
public class MainBank 
{
public static void main(String[] args) 
   {
	Account a1=new Account(1513052+55616L,"BTM");
	Customer c1=new Customer("Tushar", 8073396567l, a1);
	       c1.deposittoAccount(1600);
	       c1.WithdrawfromAcount(1599);
	
   }
}
