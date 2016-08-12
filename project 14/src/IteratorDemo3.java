
import java.util.ArrayList;
import java.util.Iterator;
 
public class IteratorDemo3 {
  public static void main(String args[]){
    ArrayList names = new ArrayList();
    
    names.add("Chaitanya");
    names.add("Steve");
    names.add("Jack");
// names.add(50);
    Iterator it = names.iterator();
 
    while(it.hasNext()) {
      String obj =(String)it.next();
      System.out.println(obj);
    }
 }
}


