package com.oops.poly;
class Cricket 
{
	public void capiton()
	{
		System.out.println("captions of the cricket team");
	}
}
class India extends Cricket
{
	public void capiton()
	{
		System.out.println("Rohit Sharma is the caption of INDIA");
	}
}
class England extends Cricket
{
    public void capiton()
	{
		System.out.println("Jos Buttler is the caption of England");
	}
}
class Search
{
    public void findCaption(Cricket c1)
    {
    	c1.capiton();
    }
}

public class Moverriding 
{     
	public static void main(String[] args) {
	Search s1 = new Search();
	     s1.findCaption(new India());
			  s1.findCaption(new England());
	
	
	}
		

}
