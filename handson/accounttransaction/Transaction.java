package accounttransaction;

public  class Transaction {
	private int accountNumber;
	private double balance;
	public Transaction() {
	}
	public Transaction(int accountNumber,double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance=balance;
	}
	 public int getAccountNumber() {
		 return accountNumber;
	 }
	 public void execute() {
		 System.out.println("Transaction class: Account created");
	 }
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		@Override
		public String toString() {
			return "Transaction [accountNumber=" + accountNumber + ", balance=" + balance + "]";
		}
}
