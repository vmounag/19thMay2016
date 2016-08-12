
 class Accounts
{
	private int accountNumber;
	private double balance;
 public int getAccountNumber(int i)
 {
	 accountNumber=i;
	 return accountNumber;
 }
 public void setBalance(int i)
 {
 double x=(int) i;
 balance=5000+x;
 System.out.println(balance);
 }
 }
 public class encap

 {
 	public static void main(String args[])
 	{
 		int i;
 	Accounts[] a =new Accounts(6);
 	for(i=1;i<6;i++)
 	{
 		a[i]=new Accounts();
 	}
 	for(i=1;i<6;i++)
 	{
 	System.out.println(a[i].getAccountNumber(i));
     a[i].setBalance(i);
 	}
 }
 }
 
 
	 
 
	



