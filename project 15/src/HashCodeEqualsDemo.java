

import java.util.HashSet;

class Employee
{
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	@Override
	public int hashCode()
	{
		System.out.println("hash code "+name.hashCode());
		return name.hashCode();
	}
	
	
	@Override
	public boolean equals(Object obj)
	{
		// instance of
		// null
		Employee emp=(Employee)obj;
		System.out.println("Comparing "+name+" with "+emp.name);
		if(name.equals(emp.name))
		{
			return true;
		}
		
		return false;
	}
	
	
}
public class HashCodeEqualsDemo {
	
	public static void main(String[] args) {
		HashSet<Employee> hs=new HashSet<>();
		
		hs.add(new Employee("abc"));
		hs.add(new Employee("acb"));
		
		System.out.println(hs);
	}

}
