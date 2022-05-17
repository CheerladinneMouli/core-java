package ai.jobiak.core;

import java.time.LocalDateTime;

public class Employee {
	int empid;
	String fullName;
	LocalDateTime dateOfJoining;
	Address residance;
	Address communication;
	static int managerId;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String fullName, LocalDateTime dateOfJoining, Address residance, Address communication,
			int managerId) {
		super();
		this.empid = empid;
		this.fullName = fullName;
		this.dateOfJoining = dateOfJoining;
		this.residance = residance;
		this.communication = communication;
		this.managerId = managerId;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDateTime getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDateTime dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Address getResidance() {
		return residance;
	}

	public void setResidance(Address residance) {
		this.residance = residance;
	}

	public Address getCommunication() {
		return communication;
	}

	public void setCommunication(Address communication) {
		this.communication = communication;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fullName=" + fullName + ", residance=" + residance + ", communication="
				+ communication + ", managerId=" + managerId + "]";
	}
	
	

}
