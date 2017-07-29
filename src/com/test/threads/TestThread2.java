package com.test.threads;

public class TestThread2 extends Thread {

	 String name;
     Synchtest syncTest;
    
     public TestThread2(String name, Synchtest syncTest) {
        this.syncTest = syncTest;
        this.name = name;
        //start();
     }
     
     public void run() {
    	 syncTest.test2(name);
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

