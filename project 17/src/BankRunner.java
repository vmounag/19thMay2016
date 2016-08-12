
public class BankRunner implements Runnable {

	ICICIbank bank;
	
	BankRunner(ICICIbank bank)
	{
		this.bank=bank;
	}
	@Override
	public void run() {
		try
		{
			if(Thread.currentThread().getName().equals("first"))
			{
				System.out.println("balance = "+bank.withdrawAmount(101, 2000));
			}
			else
			{
				System.out.println("balance = "+bank.withdrawAmount(101, 2000));
			}
					
		}catch(InvalidAccountNumberException ian)
		{
			System.out.println("Invalid account number");
		}catch(InsufficientBalanceException ibe)
		{
			System.out.println("Insufficient balance");
		}

	}

}



