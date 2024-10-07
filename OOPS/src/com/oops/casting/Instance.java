package com.oops.casting;
class Aa
{
	
}
class Bb extends Aa
{
	
}
class Cc extends Aa
{
	
}
public class Instance
{
   public static void main(String[] args) {
	Aa a1=new Aa();
	System.out.println(a1 instanceof Aa);
	System.out.println(a1 instanceof Bb);
	System.out.println(a1 instanceof Cc);
	
	System.out.println("object of Bb class");
	
	Bb b1=new Bb();
	System.out.println(b1 instanceof Bb);
	System.out.println(b1 instanceof Aa);
	//System.out.println(b1 instanceof cc); error because there is no connection between B and C
	System.out.println("object of Cc class");
	Cc c1 = new Cc();
	System.out.println(c1 instanceof Cc);
	System.out.println(c1 instanceof Aa);
	//System.out.println(C1 instanceof Bb);error because there is no connection between c and b 
}
}
