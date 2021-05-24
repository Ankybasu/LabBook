package accounttransaction;

public class Withdrawal extends Transaction{
	Transaction t;
	private Double amount;
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void execute() {
		System.out.println("Withdrawal!");
		if(amount<t.getBalance()) {
			t.setBalance(t.getBalance()-amount);
		}
		else {
			System.out.println("Cannot be withdrawn!");
		}
		
	}
	public Transaction getT() {
		return t;
	}
	public void setT(Transaction t) {
		this.t = t;
	}
}
