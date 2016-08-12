
public class Amount {
	int accountNumber;
		public Amount(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	
	}
		public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
		
		double balance;
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
}
