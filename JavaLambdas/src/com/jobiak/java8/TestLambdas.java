package com.jobiak.java8;

interface Test {
	public void print();
	public default void paint() { System.out.println("from default method");}
    public static void method() { System.out.println("from static method");} 
	public abstract void add();
}

class TestImpl implements Test{
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}

interface Test2{
	public void add(int a,int b);
}
interface Test3{
	public int factorial(int n);
}
public class TestLambdas {

	public static void main(String[] args) {
		
		Test test = ()-> {System.out.println("from print...printing");};
		
		test.print();
		
		Test2 test2 = (int a, int b) ->{
			
			int c = a+b;
			System.out.println(c);
		};
		test2.add(10,20);
		
		Test3 test3 = (int n)->{
			
			int fact=1;
			int i=1;
			while(i<=n){
				
				fact*=i;
				i++;
			}
			return fact;
		};
		
		int factorialResult = test3.factorial(5);
		System.out.println(factorialResult);
		
		Runnable r = new Runnable() {
			
			public void run() {
				
				System.out.println("from run method.....");
				
			}
		};
		Thread thread = new Thread(r);
		thread.start();
		
		Runnable r1 = ()->{ System.out.println("from()-> run method......");};
		
		thread = new Thread(r1);
		thread.start();
		
	}
}



