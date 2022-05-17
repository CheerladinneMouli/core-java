package ai.jobiak.core;

import java.time.LocalDateTime;

public class CreateEmployee2 {

	public static void main(String[] args) {
		
		Address res = new Address("53546","sundharam","Hyderabad");
		Address comm = new Address("IIT Campus","Gachhibowli","Hyderabad");
		Employee emp = new Employee(101,"mouli",LocalDateTime.now(),res,comm,1);
		
		
		
		Address resE1 = new Address("457563","kukatpalli","Hyderabad");
		Address commE1 = new Address("IIIT Campus","Gachhibowli","Hyderabad");
		Employee emp1 = new Employee(102,"ram",LocalDateTime.now(),resE1,commE1,1);
		
		
		
		Address resE2 = new Address("8543","ongole","Ap");
		Address commE2 = new Address("IIT Campus143","dilsuknagar","Hyderabad");
		Employee emp2 = new Employee(103,"jack",LocalDateTime.now(),resE2,commE2,1);
		
		
		Address resE3 = new Address("FirstFloor143","highteccity","Hyderabad");
		Address commE3 = new Address("IIT Campus","chowtuppal","Hyderabad");
		Employee emp3 = new Employee(101,"henry",LocalDateTime.now(),resE3,commE3,1);
		
		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		emp2.setManagerId(111);
		
		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}

}
