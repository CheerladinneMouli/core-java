package ai.jobiak.java;

public class Student {
	
	private String name;
	private int rollno;
	private String section;
	private long mobile;
	
	public Student() {
		
	}

	public Student(String name, int rollno, String section, long mobile) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.section = section;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", section=" + section + ", mobile=" + mobile + "]";
	}
	

}
