package com.oops.abstraction;
interface Animal
{
	public void food();
}
class Dog implements Animal
{
	public void food()
	{
		System.out.println("non-veg food");
	}
}
class Elephant implements Animal
{
	public void food()
	{
		System.out.println("Veg food");
	}
}
class FoodType
{
	public void select(Animal a1)
	{
		a1.food();
		
	}
}
public class Example2 
{ 
	public static void main(String[] args)
	{
	  FoodType ft=new FoodType();
	  ft.select(new Dog());
	  System.out.println("-----------------");
	  ft.select(new Elephant());
			  
		
	}

}
