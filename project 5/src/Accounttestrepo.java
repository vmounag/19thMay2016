
public class Accounttestrepo 
{
	public static void main(String args[])
	{
	int i;
	Accounts[] a=new Accounts[5];
	for(i=0;i<5;i++)
	{
		a[i]=new Accounts();
	}
	
	//a[0].setAccountNumber(0);
	a[0].setBalance(4000);
	
	//a[1].setAccountNumber(1);
	a[1].setBalance(5000);
	
	
	//a[2].setAccountNumber(2);
	a[2].setBalance(6000);
	
	//a[3].setAccountNumber(3);
	a[3].setBalance(6000);
	
	//a[4].setAccountNumber(4);
	a[4].setBalance(7000);
	//System.out.println(a[5].getAccountNumber());
	// System.out.println(a[5].getBalance());
	Accountrepo repo=new Accountrepo();
	for(i=0;i<5;i++)
	{
	if( repo.save(a[i]))
	{
		System.out.println("sucessful");
	}
		else {
			System.out.println("unsuccessful");
		}
	}
	Accounts x=repo.findOne(2);
	System.out.println("balance=" +x.getBalance());
	}
}

	




