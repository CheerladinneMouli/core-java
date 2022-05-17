
public class Studentintance {
	
	int rollno;
	String name;
	String branch;
	
	public static void main(String args[])  {
		Studentintance s1=new Studentintance(414,"triveni");
	}

	Studentintance(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
		System.out.println("hello");
		System.out.println("Name:-->"+name+"\nRollno:--->"+rollno);
	
	}
	
	Studentintance(int rollno, String name, String branch) {
	this.rollno = rollno;
	this.name = name;
	this.branch = branch;
	System.out.println("hi");
    System.out.println("Name:-->"+name+"\nRollno:--->"+rollno+"\nBranch: --> "+branch);
}
	

}
