package capgemini.com.atmsystem.card;

import capgemini.com.atmsystem.model.BankCustomer;

public class CardDispenser extends BankCustomer{
	private float availableCash=500000;
	public float SupplyCash() {
		return availableCash;
		
	}
	public void setAvailableCash(double amt) {
		availableCash-=amt;
	}
	public void generateReceipt(BankCustomer bc) {
		System.out.println("Details of the Transaction: ");
		System.out.println("Remaining Balance: "+bc.getAcc().getAccountNumber()+" "+bc.getAcc().getBalance());
	}
}

