package com.student.details;

public class StudentDetails 
{
	 String name = "Tushar Tiwari";
	 String emailId = "tiwaritushar777@gmail.com";
	 long phno =  8073396567l;
	 String degree = "B.com";
	 String native_place = "Kalaburgi";
	 String state = "Karnataka";
	 double CGPA = 6.65;
	 public void Sdetails()
	 {
		 int favnum =07;
		 System.out.println(name);
		 System.out.println(emailId);
		 System.out.println(phno);
		 System.out.println(degree);
		 System.out.println(native_place);
		 System.out.println(state);
		 System.out.println(CGPA);
		 System.out.println("fav_num " + favnum);
	 }
	 public static void main(String[] args)
	 {
		StudentDetails s1 = new StudentDetails();
		s1.Sdetails();
	 }
}

