import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		Amount a=new Amount(1,1000);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount to be withdrawn");
		double f=sc.nextDouble();
		Checker1 c=new Checker1();
		
		try
		{
		Amount x=c.withDraw(a,f);
		System.out.println(x.getBalance());
		}catch(InSufficientBalanceException tsb)
		{
			System.out.println("insufficient Balance");
		}
	
	}
	
}