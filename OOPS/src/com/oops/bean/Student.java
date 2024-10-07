package com.oops.bean;
import java.io.Serializable;
public class Student implements Serializable
{
private String name;
private int id;
private String pw;
public String getName()
{
	return name;
}
 public int getId()
 {
	 return id;
 }
 public String getPw()
 {
	 return pw;
 }
 public void setName(String name)
 {
	 this.name=name;
 }
 public void setId(int id)
 {
	 this.id=id;
 }
 public void setPw(String pw)
 {
	 this.pw=pw;
 }
}
