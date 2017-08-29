package com.test.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorThreadTest {

	public static void main(String args[]) {

		ExecutorThreadTest test = new ExecutorThreadTest();
		test.testExecutorWithRunnable();
		test.testExecutorWithFuture();
	}

	private void testExecutorWithRunnable() {
		ExecutorService executor = Executors.newSingleThreadScheduledExecutor();

		executor.submit(() -> {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Threadname:" + Thread.currentThread().getName());

		});

		stopExecutor(executor);
	}

	private void stopExecutor(ExecutorService executor) {
		// Shutdown the executor, otherwise it will continue running.
		try {
			executor.shutdown();
			executor.awaitTermination(2, TimeUnit.SECONDS);
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

	private void testExecutorWithFuture() {

		ExecutorService executor = Executors.newSingleThreadExecutor();

		Future<String> future = executor.submit(() -> {

			try {
				Thread.sleep(2000);
				return Thread.currentThread().getName();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
				return "Error";
			}

		});

		System.out.println("future completed? " + future.isDone());

		try {
			
			//blocks and waits for execution to complete
			// String result = future.get(); 

			// blocks and waits for only 1 second and throws timeoutexception
			String result = future.get(1, TimeUnit.SECONDS); 
			System.out.println("future completed now? " + future.isDone());
			System.out.println("result: " + result);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		stopExecutor(executor);

	}

}
