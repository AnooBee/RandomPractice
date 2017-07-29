package com.test.threads;

public class TestThread extends Thread {

	 String name;
     Synchtest syncTest;
    
     public TestThread(String name, Synchtest syncTest) {
        this.syncTest = syncTest;
        this.name = name;
        //start();
     }
     
     public void run() {
    	 syncTest.test1(name);
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

