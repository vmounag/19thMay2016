package com.capgemini;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee employee = context.getBean("employee",Employee.class);
		
		System.out.println(employee.getEmployeeNumber());
		
		System.out.println(employee.getName());
		System.out.println("Address list :");
		System.out.println (employee.getAddress().get(0).getCity());
		System.out.println (employee.getAddress().get(1).getCity());
		System.out.println("Adress Set:");
		/*int setSize=employee.getAddressset().size();
		for(int i=0;i<setSize;i++)
		{
		System.out.println(((List<Address>) employee. getAddressset()).get(i).getCity());
		}
		int mapkeySize=employee.getAdressMap().size();
		for(int i=0;i<=mapkeySize;i++)
		{
			System.out.println("Map key value is "+i);
			System.out.println("Map value are:");
			System.out.println(( employee.getAdressMap().get(i)).getCity());
		}*/

		Iterator iterator=employee. getAddressset().iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next().toString());
		}
				
		Iterator<Integer> KeyIterator= employee.getAdressMap().keySet().iterator();
		while(KeyIterator.hasNext())
		{   
			System.out.println("value in map:");
		Integer key=KeyIterator.next();
			System.out.println(employee.getAdressMap().get(key).getCity());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
