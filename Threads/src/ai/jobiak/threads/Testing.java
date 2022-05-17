package ai.jobiak.threads;

public class Testing implements Runnable{
	
	public void run() {
		
		Thread t1 = Thread.currentThread();
		System.out.println(t1);
		
		System.out.println("My name is mouli");
	}

	public static void main(String[] args) {
		
		 Testing  s = new  Testing ();
		 Thread t = new  Thread(s);Thread t1 = Thread.currentThread();
			System.out.println(t1);
		 
		 
		t.start();

	}

}
