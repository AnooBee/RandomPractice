package com.test.threads;

import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {

	private ReentrantLock lock;
	
	public Chopstick () {
		
		this.lock = new ReentrantLock();
	}
	public boolean pickup() { 
		System.out.println("pickedup");
		return lock.tryLock();
	}

	
	public void putDown() {
		System.out.println("putdown");
		lock.unlock();
		
	}
}
