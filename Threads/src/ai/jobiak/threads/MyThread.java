package ai.jobiak.threads;

public class MyThread extends Thread {
	
	String name;
	
	MyThread(String name){
		this.name=name;
		
	}
	public void run() {
		for(int i=1;i<100;i++)
			System.out.println(this.name+"#entered run() ="+i);
	}

}
