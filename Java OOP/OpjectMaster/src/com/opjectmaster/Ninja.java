package com.opjectmaster;

public class Ninja extends Human{
	
	
	
	
	public Ninja() {
		
		// TODO Auto-generated constructor stub
		this.setHealth(200);
	}


	public void steal(Human human) {
		this.setHealth(this.getHealth()+this.getStealth());
		human.setHealth(human.getHealth()-this.getStealth());
	
	}
	public void runAway() {
		this.setHealth(this.getHealth()-10);
	}
	
	
}
	