package accounttransaction;

public class BalanceInquiry extends Transaction{
	Transaction t;
	public void execute() {
		System.out.println("Balance Enquiry!");
		System.out.println("Balance is: "+t.toString());
	}
	public Transaction getT() {
		return t;
	}
	public void setT(Transaction t) {
		this.t = t;
	}
}
