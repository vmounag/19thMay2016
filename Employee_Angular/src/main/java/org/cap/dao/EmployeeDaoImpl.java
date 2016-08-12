package org.cap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.cap.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> employees=new ArrayList<>();
		
		String sql="select * from employees";
		Connection con=getMYSQLConnection();
		
		try {
			PreparedStatement stmt=con.prepareStatement(sql);
			
			
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next())
			{
				Employee employee=new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setEmpName(rs.getString("ename"));
				employee.setSalary(rs.getDouble("salary"));
				employees.add(employee);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		return employees;
	}
	
	public Connection getMYSQLConnection(){
		
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cap","root","admin");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return connection;
		
	}

}
