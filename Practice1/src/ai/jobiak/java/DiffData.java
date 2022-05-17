package ai.jobiak.java;
class DiffData {

static String name;
int age;
double salary;
static long mobile;
static float gpa;
static char section;
char department;
static boolean she;

void student(String name,long mobile,float gpa,char section,boolean she) {

this.name = "Mouli";
this.mobile=6309136705L;
this.gpa=8;
this.section='A';
this.she = true;
//System.out.println("Name "+name+"Mobile number : "+mobile+"gpa "+gpa+"Section "+section+"she "+she);
}
public static void main(String args[]) {

	DiffData d = new DiffData();
	System.out.println("Name "+name+"Mobile number : "+mobile+"gpa "+gpa+"Section "+section+"she "+she);
	
}
}