package com.oops.constructor;

import java.util.DoubleSummaryStatistics;

public class Submit 
{
	String name;
	String email;
	long contact;
	String gender;
	String city;
	String password;
	int age;
	public Submit(String name,String email,long contact,String gender,String city,String password,int age)
	{
		this.name=name;
		this.email=email;
		this.contact=contact;
		this.gender=gender;
		this.city=city;
		this.password=password;
		this.age=age;
	}
	public void SubmitDetails()
	{
		System.out.println(name);
	    System.out.println(email);
	System.out.println(contact);
	System.out.println(gender);
	System.out.println(city);
	System.out.println(password);
	System.out.println(age);
	
	}
	
		public static void main(String[]args)
		{
			Submit s1= new Submit("Tushar","tiwaritushar777@gmail.com",8073396567l,"male","Kalaburagi/Gulbarga","tushar2927",23);
			
			s1.SubmitDetails();
			System.out.println("-------------------");
			System.out.println("another details");
			System.out.println("-------------------");
			Submit s2=new Submit("Prajwal","prajwalkandgool3@gmail.com",7411907277l,"Male","Kalaburagi/Gulbagra","pk1601",22);
		s2.SubmitDetails();
		}
		
	
	
	
		

}
