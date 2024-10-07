package com.oops.abstraction;
interface User
{
	public void shoping();
}
class Customer implements User
{
	public void shoping()
	{
		System.out.println("shoping for customer");
	}
	public void buyproduct()
	{
		System.out.println("customer can buy product");
	}
	public void cancelproduct()
	{
		System.out.println("customer can cancel the product");
	}
}
class Admin implements User
{
	public void shoping()
	{
		System.out.println("shoping Service's for Admin");
	}
	public void  addproduct()
	{
		System.out.println("Admin can add the product");
	}
	public void removeproduct()
	{
		System.out.println("Admin can remove the product");
	}
}
class Service
{
	public User login(int id )
	{
		if(id==1234)
		{
		    User u1=new Customer();//upcasting
			 return u1;
		}
		else
		{
			User u2=new Admin();//upcasting
		   return u2;
		}
	}
}
public class Example3 
{
	public static void main(String[] args)
	{
		Service s1= new Service();
	        Customer c1=(Customer)s1.login(1234);//downcasting
	        c1.buyproduct();
	        c1.shoping();
	       System.out.println("-----------------");
	        User u1=(User)s1.login(1234);
	        u1.shoping();
	        User u2=(User)s1.login(1324);
	        u2.shoping();
	}

}
