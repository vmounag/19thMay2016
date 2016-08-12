import java.util.*;
public class StudentSchedular {
	
	private Student[] students=new Student[10];
	private int counterStudent;
	
	public String addStudent(int rollNumber,String name,String[] courseNames)
	{
		students[counterStudent++]=new Student(rollNumber,name,courseNames);
		return "student added successfully";
	}
	
	public Student[] showAllStudentDetails()
	{
		
		
		return Arrays.copyOfRange(students, 0, counterStudent);
	}
	public Student getIndivDetails(int rollnum){
		for(int i=0;i<counterStudent;i++){
			if(students[i].getRollNumber()==rollnum){
				return students[i];
			}
			
		}
		return null;
	}
	public boolean validateRollNumber(int rollNumber){
		for(int i=0;i<counterStudent;i++){
			if(students[i].getRollNumber()==rollNumber)
				return true;
			
		}
		return false;
	}
	public int getCourseCount(String name){
		for(int i=0;i<counterStudent;i++)
		{
			
			if(students[i].getName().equals(name))
			{
				String[] value =students[i].getCourseNames();
				return value.length;
				
			}
		}
		
		return 0;
	}
}
