package com.test.threads;

public class Account {

	double balance;
	String name;
	public Account(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	void withdraw(double amount){
	     balance -= amount;
	  } 

	  void deposit(double amount){
	     balance += amount;
	  } 

	   void transfer(Account from, Account to, double amount){
		   System.out.println("in transfer From..."+ from.getName());
		   System.out.println("in transfer To..."+ to.getName());
	        synchronized (from){
	        	System.out.println("got lock on: "+ from.getName());
	        	try {
	        		Thread.sleep(1000);
	        	} catch(Exception e) {
	        		e.printStackTrace();
	        	}
		        synchronized(to){	
		        	System.out.println("got lock on: "+ to.getName());
		        	try {
		        		Thread.sleep(1000);
		        	} catch(Exception e) {
		        		e.printStackTrace();
		        	}
			        from.withdraw(amount);
			        to.deposit(amount);		
		        }
		       
	        }
	    }

	   public double getBalance() {
		   return this.balance;
	   }
	   public String getName() {
		   return this.name;
	   }
}
