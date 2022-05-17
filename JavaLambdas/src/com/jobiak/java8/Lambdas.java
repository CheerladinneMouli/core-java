package com.jobiak.java8;

interface Test {
	public void run();
}

public class Lambdas {

	public static void main(String[] args) {
		
		Test test = ()->{System.out.println("From class to thread");};
		
		test.run();
		
		Runnable r =()->{
			for(int i=1;i<50;i++) {
				System.out.println(Thread.currentThread().getName()+i);
			}
		};
			Thread t = new Thread(r);
			t.start();
	}
}

