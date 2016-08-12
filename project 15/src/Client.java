public class Client {

	public static void main(String[] args) {
		ICICIBank bank=new ICICIBank();
		
		System.out.println(bank.createAccount(101,new Customer(("mouna"),new Address("vizag")),3000));
		
		System.out.println(bank.createAccount(102,new Customer(("mou"),new Address("vizag")),3000));
		
		try
		{
			System.out.println("Balance = "+bank.withdrawAmount(101,500));
			System.out.println("total="+bank.depositAmount( 101, 100).getAmount());
		//	System.out.println("total="+bank.depositAmount(101,100).getAmount());
		Account[] a=bank.fundTransfer(101, 102,100);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].getAmount());
		}
		}catch(InvalidAccountNumberException ian)
		{
			System.out.println("invalid account number");
		}catch(InsufficientBalanceException ibe)
		{
			System.out.println("insufficient balance");
		}catch(MinBalanceException ime)
		{
			System.out.println("no minimum balance");
		}//catch(FundTransferException fe)
		//{
		//	System.out.println("cant transfer amount");
		//}

}


}
