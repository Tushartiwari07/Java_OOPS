package com.oops.abstraction;
interface Student
{
	public void java();
}
class Qspiders implements Student
{
	public void java()
	{
		System.out.println(" Your java class is in Qspiders");
	}
}
class Jspiders implements Student
{
	public void java()
	{
		System.out.println("Your java class is in Jspiders");
	}
}
class HR
{
	public Student today(int code)
	{
		if(code==1234)
		{
			Student q1=new Qspiders();
			return q1;
		}
		else
		{
			Student j1=new Jspiders();
			return j1;
		}
	}
}
public class Practice
{ 
	public static void main(String[] args) 
	{
		HR h1=new HR();
		Student s1=h1.today(1234);
		s1.java();
		Student s2=h1.today(3214);
		s2.java();
	}

}
