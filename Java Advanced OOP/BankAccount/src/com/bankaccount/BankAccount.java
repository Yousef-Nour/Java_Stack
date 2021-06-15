package com.bankaccount;
import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingBalance;
	static Integer numberOfAccount=0;
	static double amountOfMoney=0;
	
	private String randomTenAccountNumber(){
		Random random = new Random();
		String accountNum = new String();
		for (int i = 0; i < 10; i++) {
			accountNum += random.nextInt(10);
			
		}
		return accountNum;
	}
	//Constructor
	public BankAccount() {};

	public BankAccount(String accountNumber, double checkingBalance, double savingBalance) {
		super();
		this.accountNumber = accountNumber;
		this.checkingBalance = checkingBalance;
		this.savingBalance = savingBalance;
		this.randomTenAccountNumber();
		numberOfAccount +=10;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	
	
	public void deposit(String account, double money) {
		if (money >= 0) {
			if (account == "cheacking") { //error if i remove the qutation
				this.checkingBalance += money;
				
			} 
			if (account == "saving") {
				this.savingBalance += money;
			}
			BankAccount.amountOfMoney += money;
			
		} else {
			System.out.println("Your deposit must have morethan zero !!");

		}
		
	}
	public void withdraw(String account, double money) {
		if (money>0) {
			if (account == "cheacking") {
				this.checkingBalance -= money;
				
			}
			if (account == "saving") {
				this .savingBalance -= money;
			
				
			}
			BankAccount.amountOfMoney -= money;
			
		} else {
			System.out.println("Your withdraw must have morethan zero !!");

		}
	}
	
	public double showTotal() {
		return this.amountOfMoney;
		
	}
	

	

}
