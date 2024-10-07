package com.oops.constructor;

public class Player {
    String name;
    int id;
    long phoneno;
    double rank;    
    public Player(String name,int id,long phoneno,double rank) 
    {
    	this.name=name;
    	this.id=id;
    	this.phoneno=phoneno;
    	this.rank=rank;
    }
    public void Pdeatils()
    {
    	System.out.println("Name:"+name);
    	System.out.println("Id:"+id);
    	System.out.println("Contact-no:"+phoneno);
    	System.out.println("Playeranking:"+ rank);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player("virat",18,9718181818l,9.5);
		p1.Pdeatils();
		System.out.println("---------------");
		Player p2= new Player("DHONI",07,9007070707L,9.9);
		p2.Pdeatils();

	}

}
