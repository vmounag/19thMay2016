package org.cap.model;

public class Employee {
	
	private int eid;
	private String empName;
	private double salary;
	
	public Employee(){}
	
	public Employee(int eid, String empName, double salary) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
	

}
