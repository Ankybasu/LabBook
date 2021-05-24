package accounttransaction;

public class Deposit extends Transaction{
	Transaction t;
	private Double amount;

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public void execute() {
		System.out.println("Deposit!");
		t.setBalance(t.getBalance()+amount);
	}
	public Transaction getT() {
		return t;
	}
	public void setT(Transaction t) {
		this.t = t;
	}
}
