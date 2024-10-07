package com.oops.abstraction;

	interface Student11
	{
		public void tushar();
	}
	class Jspider11 implements Student11
	{
		public void tushar()
		{
			System.out.println("Tushar is attending class in Jspiders");
		}
	}
	class  Qspiders11 implements Student11
	{
		public  void tushar()
		{
			System.out.println("Tushar is attending class in Qspiders");
		}
	}
	class TrackStudent
	{
		public Student11 track(int pin)
		{
			if(pin==1234)
			{
				Student11 j1= new Jspider11();
				return j1;
			}
			else
		{
				Student11 q1 = new Qspiders11();
				return q1;
		}
		
		}
	}

	public class Practice55 
	{
       public static void main(String[] args) 
       {
	
          TrackStudent t1 = new TrackStudent();
		   Student11 s1 =t1.track(1234);
		   s1.tushar();
//		   TrackStudent t2 = new TrackStudent();
		    Student11 s2=t1.track(4321);
		    s2.tushar();
//		    TrackStudent t3 = new TrackStudent();
		    Student11 s3=t1.track(1234);
		    s3.tushar();
	}

}
