package com.oops.casting;
//pass object from called method to calling
public class Example 
{
  public Example test(Example e1)
  {
	  return e1;
  }
  public static void main(String[] args)
  {
	Example e2= new Example();
	System.out.println(e2.test(new Example()));//object address
}
}
