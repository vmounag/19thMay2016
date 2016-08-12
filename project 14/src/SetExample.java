import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
	HashSet h=new HashSet();
h.add(1);
h.add(2);
h.add(8);
h.add(4);
System.out.println(h);
LinkedHashSet l= new LinkedHashSet();
l.add(5);
l.add(10);
l.add(15);
l.add(1);
l.add(null);
System.out.println(l);
TreeSet t=new TreeSet();
t.add(3);
t.add(2);
t.add(7);
System.out.println(t);

	}

}
