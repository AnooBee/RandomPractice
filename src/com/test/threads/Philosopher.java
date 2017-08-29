package com.test.threads;

public class Philosopher implements Runnable {

	Chopstick left, right;
	
		
	public Philosopher(Chopstick left, Chopstick right) {
		
		this.left = left;
		this.right = right;
	}
	
	private void eat() {
		
		left.pickup();
		right.pickup();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		right.putDown();
		left.putDown();
		
	}


	@Override
	public void run() {
		
		for (int i=0; i< 10; i++) {
			eat();
		}
		
	}
	
	
	
	public static void main(String ...strings) {
		
		Philosopher hungryPhil1 = new Philosopher(new Chopstick(), new Chopstick());
		Philosopher hungryPhil2 = new Philosopher(new Chopstick(), new Chopstick());
		Philosopher hungryPhil3 = new Philosopher(new Chopstick(), new Chopstick());
		Philosopher hungryPhil4 = new Philosopher(new Chopstick(), new Chopstick());
		Philosopher hungryPhil5 = new Philosopher(new Chopstick(), new Chopstick());
		
		new Thread(hungryPhil1).start();
		new Thread(hungryPhil2).start();
		new Thread(hungryPhil3).start();
		new Thread(hungryPhil4).start();
		new Thread(hungryPhil5).start();

		
	}

}
