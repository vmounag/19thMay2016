import java.util.LinkedList;

	public class ICICIBank {
		
		LinkedList<Account> accounts =new LinkedList<Account>();
		
		
		public String createAccount(int accountNumber, Customer customer,int amount)
		{
			
			Account account=new Account(accountNumber,customer,amount);
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
			
			if((account.getAmount()-amount)>=0)
			{
				account.setAmount(account.getAmount()-amount);
				return account.getAmount();
			}
			
			throw new InsufficientBalanceException();
			
		}

	public Account depositAmount(int accountNumber, int amount) throws InvalidAccountNumberException
	{
		Account account=searchAccount(accountNumber);
			account.setAmount(account.getAmount()+amount);
			
		
		System.out.println("amount deposited successfully");
		return account;
		
	}
	public Account[] fundTransfer(int account1,int account2,int amount) throws InvalidAccountNumberException, MinBalanceException,InsufficientBalanceException
	
	{	Account[] a=new Account[2];
		a[0]=searchAccount(account1);
		a[1]=searchAccount(account2);
		if((a[0].getAmount())>=500)

			//throw new FundTransferException();

{
		if((a[0].getAmount()-amount)>=0){
			
		a[0].setAmount(a[0].getAmount()-amount);
		a[1].setAmount(a[1].getAmount()+amount);
		return a;
		}else
		{
throw new InsufficientBalanceException();
		}		
}
		throw new  MinBalanceException();
	}
	}
