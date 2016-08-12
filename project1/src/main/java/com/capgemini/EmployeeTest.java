package com.capgemini;


	import javax.persistence.*;


	public class EmployeeTest
	{
		public static void main(String[] args)
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
			
			EntityManager em = emf.createEntityManager();
			EmployeeService service = new EmployeeService(em);
			
			em.getTransaction().begin();
			Department dep=service.createDepartment(22, "physics");
			em.getTransaction().commit();
			System.out.println("Persisted "+dep);
			
			em.getTransaction().begin();
			Employee emp = service.createEmployee(50948, "Sagar", 60000,dep);
			em.getTransaction().commit();
			System.out.println("Persisted "+emp);
			
			em.getTransaction().begin();
			Employee emp1 = service.createEmployee(12345, "sangamam", 40000,dep);
			em.getTransaction().commit();
			System.out.println("Persisted "+emp1);
			
			emp= service.findEmployee(50948);
			System.out.println("Found "+emp);
			
			em.getTransaction().begin();
			emp =service.raiseEmployeeSalary(50948, 20000);
			em.getTransaction().commit();
			System.out.println("Updated "+emp);
			em.close();
			emf.close();
		}
	}


