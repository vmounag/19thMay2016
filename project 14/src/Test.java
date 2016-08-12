
 class Employee {}
 class Dept{}
 public class Test{
	 static void show(Object obj)
	 {
		 if(obj instanceof Employee)
			 System.out.println("its employee object");
		 if(obj instanceof Dept)
			 System.out.println("its Dept");
	 }
 
public static void main(String args[])
{
	show(new Employee());
	show(new Dept());

}
 }
