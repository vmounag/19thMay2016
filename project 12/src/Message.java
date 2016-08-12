
public class Message {
	public static void main(String[] args) {
		int a=5, b=0,c;
		try
		{
			c=a/b;
			c=b+a;
			
		}catch(ArithmeticException ae )
		{
			System.out.println("exception catched");
			System.out.println(ae.getMessage());
		}
		
	}

}
