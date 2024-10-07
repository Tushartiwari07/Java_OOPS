package com.oops.encapsulation;
class Details
{
	private int empId;
	private String pw;
	public int getempId()
	{
		return empId;
	}
	public String getpw()
	{
		return pw;
	}
	public void setempId(int empId)
	{
		this.empId=empId;
	}
	public void setpw(String pw)
	{
		this.pw=pw;
	}
}
class Dailylogin
{
	public void login(int empId ,String pw,Details d )
	{
		if(empId==d.getempId() && pw==d.getpw())
		{
			System.out.println("login successful");
		}
		else 
		{
			System.out.println("invalid data");
		}
	}
}
public class EmpMain 
{
    public static void main(String[] args) 
    {
    
		Details d1=new Details();
		d1.setempId(2927);
		d1.setpw("Tiwari");
		Dailylogin DL=new Dailylogin();
		DL.login(2416, "Tiwari", d1);
		DL.login(2927,"Tiwari", d1);
	}
}
