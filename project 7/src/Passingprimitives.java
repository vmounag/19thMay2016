
public class Passingprimitives {
	public static void main(String args[])
	{
		int i=5;
		Passingprimitives p=new Passingprimitives();
		System.out.println("before modified="+i);
		p.modify(i);
		System.out.println("after modified="+i);
	}
	void modify(int i)
	{
		i=i+5;
		System.out.println("in method="+i);
	}
		
				
	}


