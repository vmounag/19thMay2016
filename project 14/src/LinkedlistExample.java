import java.util.LinkedList;

public class LinkedlistExample {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(2);
		list.add(3);
		list.add(55);
		list.add(7);
		list.add(4);
		list.add(null);
		System.out.println(list);
		list.indexOf(55);
		int a=list.indexOf(55);
		list.set(a, 60);
	System.out.println(list);
	list.indexOf(65);
	System.out.println(list.indexOf(65));
		int x=list.indexOf(65);
		list.set(x,10);
		System.out.println(list);
	}

}
