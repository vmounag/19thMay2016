import java.util.Scanner;


public class Admin {

	private static Scanner sc=new Scanner(System.in);
	private static StudentSchedular studSch=new StudentSchedular();
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
			case 3:System.exit(0);
			       
			}
		}
		
	}

	private static void acceptStudentDetails() {
		System.out.println("Enter roll number");
		int rollNumber=sc.nextInt();
		
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println(studSch.addStudent(rollNumber, name));
		
	}

	private static void showAllStudentDetails() {
		studSch.showAllStudentDetails();
		
	}

}



