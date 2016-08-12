 class ClassA
{
	 ClassA()
	 { 
		 System.out.println("constructor");
	 }
	 ClassA(int a)
	 {
		 System.out.println("constructor with parameter"+a);
	 }
}
 
 class ClassB extends ClassA
 {
	 int k,a;
	 ClassB()
	 {
	
		 System.out.println("second constructor");
		 
	 }
	 ClassB(int k)
	 {
		 super(20);
		 this.k=k;
		 System.out.println(k);
	 }
 }
public class ClassC extends ClassB
 {
	 ClassC()
	 {
		 
		 System.out.println("third constructor");
		 
	 }
	 ClassC(int b)
	 {
		 super(10);
		 System.out.println(b);
	 }
	 public static void main(String args[])
	 {
		 ClassC sc1=new ClassC();
		 ClassC sc=new ClassC(30);
		// ClassB sc1=new ClassB();
		
		 
	 }
 }