public class Account {
	private int accountNumber;
	private Customer customer;
	private int amount;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Account(int accountNumber, Customer customer, int amount) {
		super();
		this.accountNumber = accountNumber;
		this.customer = customer;
		this.amount = amount;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	

	

}
