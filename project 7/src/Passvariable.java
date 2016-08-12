
public class Passvariable {
	public static void main(String args[])
	{
		int passvariable;
		Passvariable d=new Passvariable(5);
		Passvariable p=new Passvariable();
		System.out.println("before modified="+d);
		p.modify(d);
		System.out.println("after modified="+d);
	}
	void modify(Passvariable dim)
	{
		dim=dim-5;
		System.out.println("in method="+dim);
	
	
		
	}

}
