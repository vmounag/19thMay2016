class Account
{
int accountNumber;
double balance;
}
public class AccountTestArray

{
	public static void main(String args[])
	{
		int i;
	Account[] a =new Account[6];
	for(i=1;i<6;i++)
	{
		a[i]=new Account();
	}
	for(i=1;i<6;i++)
	{
		a[i].accountNumber=i;
		a[i].balance=5000;
	}
	for(i=1;i<6;i++)
	{
	System.out.println(a[i].accountNumber);
System.out.println(a[i].balance);
	}
}
}
