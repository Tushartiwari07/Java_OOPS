package com.oops.has_a_relation;
class Address
{
	int room_no;
	String buildingName;
	String area;
	int pincode;
	String city;
	String state;
	public Address(int room_no,String buildigName,String area,int pincode,String city,String state)
	{
		this.room_no=room_no;
		this.buildingName=buildigName;
		this.area=area;
		this.pincode=pincode;
		this.city=city;
		this.state=state;
	}
	public void displayAddress()
	{
		System.out.println("Room-no: "+ room_no);
		System.out.println("building-name: "+ buildingName);
		System.out.println("area: "+ area);
		System.out.println("Pincode: "+ pincode);
		System.out.println("City: "+ city);
		System.out.println("State: "+ state);
	}
}
class Employee
{
	String name;
	int empid;
	long phoneno;
	Address a1;
	public Employee(String name,int empid, long phoneno, Address a1)
	{
		this.name=name;
		this.empid=empid;
		this.phoneno=phoneno;
		this.a1=a1;
	}
	public void DisplayEmployeeDetails()
	{
		System.out.println("Name: "+ name);
		System.out.println("Employee-id:"+ empid);
		System.out.println("phone-no: "+ phoneno);
		a1.displayAddress();
	}
}
public class MainEmp 
{ 
	public static void main(String[] args) 
	{
		Address a1=new Address(302,"Ganesh-pg","BTM",560076,"Bengaluru","karnataka");
		Employee e1=new Employee("Tushar Tiwari",2927,8073396567l,a1);
		e1.DisplayEmployeeDetails();
		
	}

}
