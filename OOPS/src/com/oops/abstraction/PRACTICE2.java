package com.oops.abstraction;
interface Student1
{
	public void java();
}
class Qspiders1 implements Student1
{
	public void java()
	{
		System.out.println(" Your java class is in Qspiders");
	}
}
class Jspiders1 implements Student1
{
	public void java()
	{
		System.out.println("Your java class is in Jspiders");
	}
}
class HR1
{
	public void  today(Student1 s1)
	{
	    s1.java();
	}
}
	public class PRACTICE2
	{
	public static void main(String[] args) 
	{
		HR1 h1=new HR1();
		System.out.println("1st Student");
		h1.today(new Qspiders1());
		System.out.println("2nd Student");
		h1.today(new Jspiders1());
	}

}
