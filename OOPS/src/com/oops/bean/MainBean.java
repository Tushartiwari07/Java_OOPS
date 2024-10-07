package com.oops.bean;

public class MainBean {

	public static void main(String[] args) {
		
    Student s1 = new Student();
    s1.setName("vishal");
    s1.setId(420);
    s1.setPw("420-vishal");
    System.out.println(s1.getName());
    System.out.println(s1.getId());
    System.out.println(s1.getPw());
	}
}
