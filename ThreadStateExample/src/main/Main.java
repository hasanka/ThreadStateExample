package main;

import logic.BasicStateExample;

public class Main {

	public static void main(String[] args) {
		Thread t = new Thread(new BasicStateExample(), "Thread_One");
		try {
			System.out.println("Just after creating thread; \n" + " The thread state is: " + t.getState());
			t.start();
			System.out.println("Just after calling t.start(); \n" + " The thread state is: " + t.getState());
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Just after main calling t.join(); \n" + " The thread state is: " + t.getState());

	}

}
