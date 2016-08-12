
public class Student {
	private int rollNumber;
	private String name;
	private String[] courseNames;
	public String[] getCourseNames() {
		return courseNames;
	}
	public void setCourseNames(String[] courseNames) {
		this.courseNames = courseNames;
	}
	public Student(int rollNumber, String name,String[] courseNames) {
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
	
	
}
