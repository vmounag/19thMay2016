

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee employee = context.getBean("employee",Employee.class);
		
		System.out.println(employee.getEmployeeNumber());
		
		System.out.println(employee.getName());
		
		System.out.println(employee.getAddress().getCity());
		

	}

}
