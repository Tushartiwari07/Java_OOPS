package com.oops.encapsulation;
class Idetails
{
	private String username;
	private int password;
	public String getusername()
	{
		return username;
	}
	public int getpassword()
	{
		return password;
	}
	public void setusername( String username)
	{
		this.username=username;
	}
	public void setpassword(int password)
	{
		this.password=password;
	}
}
class LoginPage
{
	public void login(String un , int pw, Idetails i1)
	{
		if(un==i1.getusername()&& pw==i1.getpassword())
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("login failed");
		}
		
	}
}

public class Insta 
{ 
	public static void main(String[] args) 
	{
	    Idetails id =new Idetails();
	    id.setusername("abc");
	    id.setpassword(456);
	    //2nd object
	    Idetails id1 = new Idetails();
	    id1.setpassword(123);
	    id1.setusername("xyz");
	    LoginPage lp = new LoginPage();
	    lp.login("abc", 456, id);
	    lp.login("kjdc", 04, id);
	    lp.login("xyz", 123, id1);
	}

}
