package com.capgemini;



	import java.util.Set;

	import javax.persistence.*;
	@Entity
	public class Department 
	{

		@Id private int departmentId;
		private String departmentName;
		@OneToMany
		private Set<Employee> employees;
		
		public Department()
		{
			
		}
		
		public Department(int departmentId)
		{
			this.departmentId = departmentId;
		}

		public int getDepartmentId()
		{
			return departmentId;
		}
		

		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}

		public String getDepartmentName() {
			return departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}

		public Set<Employee> getEmployees() {
			return employees;
		}

		public void setEmployees(Set<Employee> employees) {
			this.employees = employees;
		}


		@Override
		public String toString() {
			return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
		}
		
	}

