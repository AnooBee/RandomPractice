package com.test.threads;

public class Synchtest {
	
	int sharedRes=0;
	
	final Object obj1 = new Object();
	final Object obj2 = new Object();
	public Synchtest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Synchtest test = new Synchtest();
		
		Thread thread1 = new TestThread("thread1", test);
		Thread thread2 = new TestThread("thread2", test);
		Thread thread3 = new TestThread("thread3", test);
		
		Thread thread4 = new TestThread2("thread3", test);
		thread1.start();
		
		thread2.start();
		thread3.start();
		thread4.start();
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("shared resource ..."+ test.getSharedResournce());
		
	}
	
	public void test1(String name) {
		
		for (int i=0; i<3; i++) {
			System.out.println("...in test1 ...."+ name+ " i= "+i );
			synchronized (obj1) {
				try {
					System.out.println("Locked obj1 "+sharedRes);
					sharedRes++;
					Thread.sleep(500);
					//this.test2(name);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		}
	}
	
	public int getSharedResournce() {
		return this.sharedRes;
	}
	public synchronized void test2(String name) {
		
		for (int i=0; i<3; i++) {
			System.out.println("...in test2 ...."+ name+ " i= "+i );
			try {
				Thread.sleep(500);
				sharedRes--;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
