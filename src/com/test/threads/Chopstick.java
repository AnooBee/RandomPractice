package com.test.threads;

import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {

	ReentrantLock lock;
	
	public boolean pickup() { 
		return lock.tryLock();
	}

	
	public void putDown() {
		lock.unlock();
		
	}
}
