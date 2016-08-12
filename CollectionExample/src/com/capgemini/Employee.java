package com.capgemini;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	
	private int employeeNumber;
	private String name;
	
	private List<Address> address;
	private Set<Address> addressset;
	private Map<Integer,Address> adressMap;
    
	
	private Properties addressProps;

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public Set<Address> getAddressset() {
		return addressset;
	}

	public void setAddressset(Set<Address> addressset) {
		this.addressset = addressset;
	}

	

	public Map<Integer, Address> getAdressMap() {
		return adressMap;
	}

	public void setAdressMap(Map<Integer, Address> adressMap) {
		this.adressMap = adressMap;
	}

	public Properties getAddressProps() {
		return addressProps;
	}

	public void setAddressProps(Properties addressProps) {
		this.addressProps = addressProps;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", name=" + name + ", address=" + address
				+ ", addressset=" + addressset + ", adressMap=" + adressMap + ", addressProps=" + addressProps + "]";
	}

	
}
