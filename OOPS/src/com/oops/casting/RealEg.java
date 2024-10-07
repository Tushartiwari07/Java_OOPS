package com.oops.casting;
class User
{

}
class Customer extends User
{
	public void buyproduct()
	{
		System.out.println("customer can buy the product");
	}
	public void cancelproduct()
	{
		System.out.println("customer can cancel the product");
	}
}
class Admin extends User
{
	public void addproduct()
	{
		System.out.println("Admin can add the product");

	}
	public void removeproduct()
	{
		System.out.println("Admin  can remove the product");
	}
}
class loginpage
{
	public User login(User obj )
	{
		if(obj instanceof Customer)
		{
			Customer c1=(Customer)obj;
			return c1;
		}
		else
		{
			Admin a1=(Admin)obj;
			return a1;
		}

	}
}
public class RealEg
{
	public static void main(String[] args)
	{
		loginpage lp=new loginpage();
     Customer c1=(Customer)lp.login(new Customer());
     c1.buyproduct();
     c1.cancelproduct();
     System.out.println("----------------------------------");
     Admin a1=(Admin)lp.login(new Admin());
     a1.addproduct();
     a1.removeproduct();
     

	}

}
