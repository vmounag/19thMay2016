package project6;

class AccountService
{
	private int i=1;
	{
		Accountrepo repo=new Accountrepo();
	public Accounts createAccount(double amount)
	{
		Accounts a=new Accounts();
		a.setAccountNumber(i);
		a.setBalance(amount);
		if(repo.save(a))
		System.out.println("success");
	else
	
		System.out.println("fail");
		i++;
		return a;
	}
	public Accounts showBalance(int accountNumber)
	{
		
	}
}
	}
	