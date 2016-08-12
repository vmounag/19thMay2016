import java.util.LinkedList;

public class ICICIbank {
	
	LinkedList<Account> accounts =new LinkedList<Account>();
	
	
	public String createAccount(int accountNumber,int amount)
	{
		
		Account account=new Account(accountNumber,amount);
		accounts.add(account);
		return "account created successfully";
	}
	
	private Account searchAccount(int accountNumber)throws InvalidAccountNumberException
	{
		for(Account account:accounts)
		{
			if(account.getAccountNumber()==accountNumber)
			{
				return account;
			}
		}
		
		throw new InvalidAccountNumberException();
	}
	
	public int withdrawAmount(int accountNumber,int amount) throws InsufficientBalanceException, InvalidAccountNumberException
	{
		
		Account account=searchAccount(accountNumber);
		synchronized (account) {
		
		if((account.getAmount()-amount)>=0)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			account.setAmount(account.getAmount()-amount);
			return account.getAmount();
		}
		}
		throw new InsufficientBalanceException();
		
	}

}



