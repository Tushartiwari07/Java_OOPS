package com.oops.interface1;

import javax.print.attribute.standard.Sides;

interface photoedit
{
public void resize();
public void crop();
public void addfilter();
}
interface post
{
	public void like ();
	public void comment();
	public void share();
}
interface vedioedit
{
	public void trim();
	public void addvedio();
	public void changespeed();
}
class Photo implements photoedit,post
{
	double size;
	int reso;
	String type;
	public void college()
	{
		System.out.println("college photos");
	}
	public void resize()
	{
		System.out.println("resize photo");
		
	}
	public void crop()
	{
		System.out.println("crop photo");
	}
	public void addfilter()
	{
		System.out.println("aff fliters to photo");
	
	}
	public void like ()
	{
		System.out.println("like PHOTO/VEDIO");
	}
	public void comment()
	{
		System.out.println("comment PHOTO/VEDIO");
	}
	public void share()
	{
		System.out.println("share PHOTO VEDIO");
	}
}
class Vedio implements post,vedioedit
{
	double size;
	int duration;
	String quality;
	public void minutes()
	{
		System.out.println("minutes of vedios");
	}
	public void trim()
	{
		System.out.println("trim your vedio");
	}
	public void addvedio()
	{
		System.out.println("add vedio");
	}
	public void changespeed()
	{
		System.out.println("change the speed of vedio");
	}
	public void like ()
	{
		System.out.println("like PHOTO/VEDIO");
	}
	public void comment()
	{
		System.out.println("comment PHOTO/VEDIO");
	}
	public void share()
	{
		System.out.println("share PHOTO VEDIO");
	}
}
public class Maininterface 
{
  public static void main(String[] args)
  {
	  Photo p1=new Photo();
	  p1.resize();
	  p1.crop();
      p1.addfilter();
      p1.like();
      p1.comment();
      p1.share();
      System.out.println("size " + p1.size);
      System.out.println(p1.reso);
      System.out.println(p1.type);
      p1.college();
       Vedio v1=new Vedio();
       v1.trim();
       v1.addvedio();
       v1.changespeed();
       v1.like();
       v1.comment();
       v1.share();
       System.out.println("size " + v1.size);
       System.out.println("duration " + v1.duration);
       System.out.println("quality " + v1.quality);
      
}
}
