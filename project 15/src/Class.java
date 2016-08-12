import java.util.*;  
class Class{  
 public static void main(String args[]){  
   
  ArrayList<String> al=new ArrayList<String>();//creating arraylist  
  al.add("Ravi");//adding object in arraylist  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");
 // System.out.println(al);
  Iterator it=al.iterator();
  while(it.hasNext())
  {
	 System.out.println(it.next()); 
  }
 }
}