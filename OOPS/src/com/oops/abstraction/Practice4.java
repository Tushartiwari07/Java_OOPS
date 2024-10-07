package com.oops.abstraction;

interface ItSector
{
	public void jobrole();
}
class Java implements ItSector
{
	public void jobrole()
	{
		System.out.println("He is a java developer");
	}	
}
class Python implements ItSector
{
	public void jobrole()
	{
		System.out.println("he is a Phthon developer");
	}
}
class Interview
{
	public ItSector requirement(int pin)
	{
		if(pin==456)
		{
			ItSector j1 = new Java();
			return j1;
	    }
		else 
		{
			ItSector p1=new Python();
			return p1;
		}
		
	}
}
public class Practice4
{
   public static void main(String[] args) 
   {
	Interview i1 = new Interview();
	ItSector it =i1.requirement(456);
	it.jobrole();
	
	   
  }
}
