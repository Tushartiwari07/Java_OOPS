package com.oops.constructor;

public class FBlogin 
{

String name;
String email;
String username;
long contact;
String gender;
String city;
String password;
int age;
public  FBlogin(String name,String email,long contact,String gender,String city,String password,int age)
{
	this.name=name;
	this.email=email;
	this.contact=contact;
	this.gender=gender;
	this.city=city;
	this.password=password;
	this.age=age;
}
public  FBlogin(String name,long contact,String gender,String username,String city,String password,int age)
{
	this.name=name;
	this.contact=contact;
	this.gender=gender;
	this.city=city;
	this.username=username;
	this.password=password;
	this.age=age;
}

public void fbDetails()
{
	System.out.println("name : "+name);
    System.out.println("email : "+email);
    System.out.println("username : "+username);
System.out.println("phone-no : "+contact);
System.out.println("gender : "+gender);
System.out.println("city : "+city);
System.out.println("password : "+password);
System.out.println("age : "+age);
}
public static void main(String[] args)
{
	FBlogin f1=new FBlogin("Tushar",8073396567l,"Male","tushar2927","kalaburagi","2927tiwari" ,23);
	f1.fbDetails();
	
}
}

