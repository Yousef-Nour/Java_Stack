package com.opjectmaster;



public class HumanTest {
	public static void main(String[] args) {
		Human name1 = new Human();
		Human name2 = new Human();
		name1.attack(name2);
		System.out.println(name2.getHealth());
		System.out.println(Samurai.howMany());
	}

}
