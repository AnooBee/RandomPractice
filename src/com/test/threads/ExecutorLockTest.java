package com.test.threads;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ExecutorLockTest {

	public static void main(String[] args) {

		ExecutorLockTest lockTest = new ExecutorLockTest();

		lockTest.testReadWriteLock();

	}

	private void testReadWriteLock() {

		ExecutorService executor = Executors.newFixedThreadPool(5);

		ReadWriteLock lock = new ReentrantReadWriteLock();

		HashMap<String, String> newMap = new HashMap<>();

		// insert into map using a write lock
		executor.submit(() -> {
			try {
				lock.writeLock().lock();

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				newMap.put("hi", "hola");

			} finally { // unlock in finally to prevent holding of lock in case of run time ex
				lock.writeLock().unlock();
			}

		});

		// Read task
		Runnable readTask = () -> {
			System.out.println("Attempting to read...");
			try {
				lock.readLock().lock();
				String result = newMap.get("hi");

				System.out.println("Result..." + result);

			} finally {
				lock.readLock().unlock();
			}

		};

		//Read threads
		executor.submit(readTask);
		executor.submit(readTask);

		//stop executor
		stopExecutor(executor);
		
	}

	
	private void stopExecutor(ExecutorService executor) {
		// Shutdown the executor, otherwise it will continue running.
		try {
			executor.shutdown();
			executor.awaitTermination(5, TimeUnit.SECONDS);
			System.out.println("Try Shutdown");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			if (!executor.isTerminated()) {
				System.err.println("Finally...cancel non-finished tasks");
			}
			executor.shutdownNow();
			System.out.println("shutdown finished");
		}
	}
	
}
