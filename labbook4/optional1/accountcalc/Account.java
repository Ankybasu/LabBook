package accountcalc;

public class Account {
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	private static int count=0;
	private long accNum;
	private double balance;
	private Person accHolder;
	public void deposit(double balance) {
		this.balance+=balance;
	}
	public void withdraw(double amount) {
		if(this.balance>500) {
			this.balance-=amount;
		}
	}
	public void setBalance(double amount) {
		this.balance = amount;
	}
	public double getBalance() {
		return balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		count++;
		this.accNum=count;
		this.accHolder = accHolder;
	}
}
