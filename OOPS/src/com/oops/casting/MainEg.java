package com.oops.casting;
//pass value from called method to calling
public class MainEg 
{ 
	public int test(int a)
	{
		return a;
	}
	public static void main(String[] args) 
	{ 
		MainEg e1= new MainEg();
		System.out.println(e1.test(10));
		System.out.println(e1.test('t'));
	}

}
