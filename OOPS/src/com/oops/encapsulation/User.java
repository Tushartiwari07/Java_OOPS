package com.oops.encapsulation;

 class User1
{
	private String username;
	private String password;
	public String getUsername()
	{
		return username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setUsername(String username)
	{
		this.username=username;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
}
public class User
{
	public void login(String username, String password, User1 u)
	{
	if(username==u.getUsername()&&password==u.getPassword())
	{
		System.out.println("login successful");
	}
	else
	{
		System.out.println("Invaild data");
	}
	}
    public static void main(String[]args) {
		User1 u1=new User1();
		u1.setUsername("tushar");
		u1.setPassword("2927");
		User u5=new User();
		u5.login("tushar","2927", u1);
		u5.login("Tushar","2927",u1);
	}

}

