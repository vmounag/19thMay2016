package org.cap.service;

import java.util.List;

import org.cap.dao.EmployeeDao;
import org.cap.dao.EmployeeDaoImpl;
import org.cap.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao empDao=new EmployeeDaoImpl();
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return empDao.getAllEmployees();
	}

}
