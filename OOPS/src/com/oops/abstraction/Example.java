package com.oops.abstraction;

interface Hotel
{
	public void order();
}
class VegHotel implements Hotel
{
	public void order()
	{
		System.out.println("veg food is ordered");
		
	}
}
class NonVegHotel implements Hotel
{
	public void order()
	{
		System.out.println("non-veg food is ordered");
	}
}
class SelectHotel
{
	public Hotel select(String colour)
	{
		if(colour=="green")
		{
		   Hotel h1=new VegHotel();
		   return h1;
		}
		else
		{
			Hotel h2=new NonVegHotel();
			return h2;
		}
	}
}
public class Example 
{
public static void main(String[] args)
  {
	SelectHotel sh= new SelectHotel();
               Hotel h1= sh.select("green");
               h1.order();
          Hotel h2=sh.select("black");
          h2.order();
        
  }
}
