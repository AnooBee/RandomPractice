package com.test.threads;

public class TestAccountThread extends Thread {

	 Account  newAccount;
	
	 Account fromAccount;
	 Account toAccount;
	 double amount;
	 
	 final int amtFinal = 5;
	 
     public TestAccountThread(Account accountFrom, Account accountTo, double amount) {
		// TODO Auto-generated constructor stub
    	 this.fromAccount = accountFrom;
    	 this.toAccount = accountTo;
    	 this.amount = amount;
	}

	public void run() {
    	 fromAccount.transfer(fromAccount, toAccount, amount);
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account accountFrom = new Account("accountFrom");
		Account accountTo = new Account("accountTo");
		
		try {
			Thread thread1 = new TestAccountThread(accountFrom, accountTo, 5);
			
			Thread thread2 = new TestAccountThread(accountFrom, accountTo, 10);
			thread1.start();
			thread2.start();
			thread1.join();
			thread2.join();
			
			
			
			System.out.println("balance To..."+ accountTo.getBalance());
			System.out.println("balance From..."+ accountFrom.getBalance());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		
	}

}

