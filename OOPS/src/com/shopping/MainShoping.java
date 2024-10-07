package com.shopping;
import java.util.Scanner;
class Shoping
{
	public void order()
	{
		System.out.println("order placed");
	}
}
class Fashion extends Shoping
{
	public void men()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Mens fashion is selected");
		System.out.println("1 .order 2 .cancel");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		if(choice==1)
		{
			order();
		}
		else if(choice==2)
		{
			System.out.println("product canclled");
		}
	}
	public void women()
	{
		System.out.println("womens fashiom is selected");
		System.out.println("1. order 2. cancle");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter uour choice");
		int choice = sc.nextInt();
		if(choice==1) 
		{
			order();
			
		}
		else if(choice==2)
		{
			System.out.println("product cancelled");
		}
	}
	class Electronics extends Shoping
	{
		public void mobiles()
		{
			System.out.println("mobiles selected");
		}
		public void laptops()
		{
			System.out.println("laptops selected");
		}
	}
	class Grocery extends Shoping
	{
		public void oils()
		{
			System.out.println("oils selected");
		}	
	}
}
	class FashionBrands extends Fashion
	{
		public void puma()
		{
			System.out.println("puma brand is selected");
			Scanner sc=new Scanner(System.in);
			System.out.println("1. mens 2. womens");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			if(choice==1)
			{
				men();
			}
			else if(choice==2)
			{
				women();
			}
			else
			{
				System.out.println("invalid choice");
			}
		}
		public void zara()
		{
			System.out.println("zara brand is selected");
			Scanner sc=new Scanner(System.in);
			System.out.println("1. mens  2. womens");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			if(choice==1)
			{
				men();
			}
			else if(choice==2)
			{
				women();
			}
			else 
			{
				System.out.println("invalid choice");
			}
		}
	}
	class ElectronicsBrand //extends Electronics
	{
		public void samsung()
		{
			System.out.println("samsung brand is selected");	
		}
		public void apple()
		{
			System.out.println("apple brand is selected");
		}
	}

public class MainShoping 
{
     public static void main(String[] args)
     {
    	 System.out.println("-----welcome to shoping app------");
    	 Scanner sc= new Scanner(System.in);
    	 System.out.println("-------fashion brands  2.Electronics Brand  3. Grocery----");
    	 System.out.println("enter your choice");
    	 int choice=sc.nextInt();
    	 switch(choice)
    	 {
    	 case 1: FashionBrands f1 = new FashionBrands();
    	 System.out.println("welcome to fashion Brands");
    	 System.out.println("1. puma  2. zara");
    	 System.out.println("enter your brand");
    	 int brand=sc.nextInt();
    	 if(brand==1)
    	 {
    		 f1.puma();
    	 }
    	 else if(brand==2)
    	 {
    		 f1.zara(); 
    	}
    	 else
    	 {
    		 System.out.println("invalid brand");
    	 }
    	 break;
    	 case 2:
    		 break;
    		 default : System.out.println("invaild choice");
    	 }
     }	 
    }


