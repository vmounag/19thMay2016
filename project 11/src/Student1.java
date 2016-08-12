public class Student1 {
	private int rollNumber;
	private String name;
	private String[] courseNames;
	public Student1(int rollNumber, String name,String[] courseNames) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.courseNames=courseNames;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String[] getCourseNames()
	{
		return courseNames;
	}
	public void setCoursenames(String[] courseNames)
	{
		this.courseNames=courseNames;
	}
}



