import java.util.*;
public class StudentScheduler {
	
	private Student1[] students=new Student1[10];
	private int counterStudent;
	
	public String addStudent(int rollNumber,String name,String[] array)
	{
		students[counterStudent]=new Student1(rollNumber,name,array);
		counterStudent++;
		return "student added successfully";
	}
	
	public Student1[] showAllStudentDetails()
	{
	return Arrays.copyOfRange(students,0,counterStudent);
	}
	public void getindividualStudentReport(int rollNumber){
		int i;
	
	for(i=0;i<counterStudent;i++)
		{
		if(students[i].getRollNumber()==rollNumber)
		{
			
			
			System.out.println(students[i].getName());
			System.out.println(students[i].getCourseNames()[i]);
		}
	
	
	}

	}
}