package com.oops.poly;
//               Method riding 
class Animal
{
 public void food()
 {
	System.out.println("Food"); 
 }
}
class Dog extends Animal
{
	public void food() 
	 {
		System.out.println("Non-veg Food"); 
	 }
}
class Elephant extends Animal
{
	public void food() 
	 {
		System.out.println(" veg Food"); 
	 }
}
class FoodType
{
	public void select(Animal a1)
	{
		a1.food();
	}
}
public class Runtime
{
public static void main(String[] args)
  {
	FoodType ft= new FoodType();
	ft.select(new Dog());
	ft.select(new Elephant());
  }
}
