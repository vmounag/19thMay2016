import java.util.HashMap;
public class MapExample {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"one");
		
		hm.put(5, "null");
		hm.put(0, "null");
		System.out.println(hm);
	}

}
