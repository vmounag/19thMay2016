
import java.util.Scanner;


public class Main{

	private static Scanner sc=new Scanner(System.in);
	private static StudentScheduler studSch=new StudentScheduler();
	public static void main(String[] args) {
		showMenu();

	}

	private static void showMenu() {
		int choice;
		while(true)
		{
			System.out.println("1.add student");
			System.out.println("2.show all student details");
			System.out.println("3.exit");
			
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:acceptStudentDetails();
			       break;
			case 2:showAllStudentDetails();
			       break;
			case 3:individualstudentreport();       
			case 4:System.exit(0);
			       
			}
		}
		
	}

	private static void acceptStudentDetails() {
		System.out.println("Enter roll number");
		int rollNumber=sc.nextInt();
		
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("enter number of courses");
		int x=sc.nextInt();
		System.out.println("enter course names");
		String[] array=new String[x];
		for(int i=0;i<x;i++)
		{
			array[i]=sc.next();
		}
		
		System.out.println(studSch.addStudent(rollNumber, name, array));
		
	}

	private static void showAllStudentDetails() {
		Student1[] s=studSch.showAllStudentDetails();
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].getRollNumber());
			System.out.println(s[i].getName());
			System.out.println(s[i].getCourseNames()[i]);
			
		}
		private static void individualStudentReport(int rollNumber)
		{
			
		}
		
	}

}



