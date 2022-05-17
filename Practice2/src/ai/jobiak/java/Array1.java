package ai.jobiak.java;

public class Array1 {

	public static void main(String[] args) {
		Student arr[] = new Student[3];
		arr[0] = new Student ("mouli",411,"A",830913670L);
		arr[1]= new Student ("pavani",420,"B",9909136705L);
		arr[2] = new Student ("hari",419,"C",753136705L);
		
		for(Student x : arr) {
			System.out.println(x);
		}
		
		
		
	}

}
