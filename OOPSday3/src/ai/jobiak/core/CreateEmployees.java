package ai.jobiak.core;

import java.time.LocalDateTime;

public class CreateEmployees {

	public static void main(String[] args) {
		
		Address res = new Address("FirstFloor143","sundharam","Hyderabad");
		Address comm = new Address("IIT Campus","Gachhibowli","Hyderabad");
		Employee emp = new Employee(101,"mouli",LocalDateTime.now(),comm,res,1);
		
		System.out.println(emp);
		//to update composed residance,first uptain the reference of the composed object with get
		//emp.getResidance().setBuilding("satyam");
		System.out.println(emp);
		System.out.println(emp.getResidance());
		System.out.println(emp.getCommunication());
		

	}

}
