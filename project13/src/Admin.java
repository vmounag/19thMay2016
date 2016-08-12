
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
			System.out.println("3.indivreport");
			System.out.println("4.coursecount");
			System.out.println("5.exit");
			
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:acceptStudentDetails();
			       break;
			case 2:showAllStudentDetails();
			       break;
			case 3:indivStudentDetails();
					break;
			case 4:courseCount();
					break;
			case 5:System.exit(0);
			       
			}
		}
		
	}
	private static void acceptStudentDetails() {
		System.out.println("Enter roll number");
		int rollNumber=sc.nextInt();
		boolean b=studSch.validateRollNumber(rollNumber);
		
		if(b==true )
		{
			System.out.println("exists");
		
		}
		else
		{
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("enter no of courses");
			int j=sc.nextInt();
			String[] courseNames=new String[j];
			for(int i=0;i<j;i++){
				courseNames[i]=sc.next();
			
			}
		System.out.println(studSch.addStudent(rollNumber, name,courseNames));}
		
		}

	private static void showAllStudentDetails() {
		
		Student[] s=studSch.showAllStudentDetails();
	
		for(int i=0;i<s.length;i++){
		System.out.println(s[i].getRollNumber());
		System.out.println(s[i].getName());
		String[] courses=s[i].getCourseNames();
		for(int j=0;j<courses.length;j++){
		System.out.println(courses[j]);
		}
		}
		
	}
	private static void indivStudentDetails(){
		System.out.println("enter the student details to be found");
		
		Student a=studSch.getIndivDetails(sc.nextInt());
		if(a==null){
			System.out.println("not exists");
		}
		else{
			System.out.println(a.getRollNumber());
			System.out.println(a.getName());
			String[] courses1=a.getCourseNames();
				for(int j=0;j<courses1.length;j++){
		
					System.out.println(courses1[j]);
				}
			}
	}
	
	private static void courseCount(){
		System.out.println("enter name");
		
		int corsCount=studSch.getCourseCount(sc.next());
		
		System.out.println(corsCount);
		
	}
	
}

