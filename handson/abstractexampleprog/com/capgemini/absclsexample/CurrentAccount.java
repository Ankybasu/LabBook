package com.capgemini.absclsexample;

public class CurrentAccount extends BankAccount{

	int withDrawAmt;
	int depAmt;
	public CurrentAccount() {
	super();//default constructor of the super class is called
}

	@Override
	public void openAccount() {
			super.enterDetailsToOpenAccount();
			super.minBal = 3000;
			System.out.println("Enter accid");
			accId = details.nextInt();
			System.out.println("Enter accHolderName");
			details.nextLine();
			accHolderName = details.nextLine();
			System.out.println("Enter actualBal");
			actualBal = details.nextInt();
			System.out.println("Enter address");
			details.nextLine();
			address = details.nextLine();
			super.accType = "Current";
	}



	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("amount credited = " + (actualBal));
	}

	@Override
	public void withDraw() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to withdraw");
		withDrawAmt = details.nextInt();
		System.out.println("after with draw balance = " + (updateAmount()));
		System.out.println("thank you");
	}
	

	public float updateAmount() {
		// TODO Auto-generated method stub
		actualBal-=withDrawAmt;
		return (actualBal);
		
	}
	
	public void addMoney() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to deposit");
		depAmt = details.nextInt();
		actualBal += depAmt;
		System.out.println("after with deposit balance = " + (actualBal));
		System.out.println("thank you");
	}

	@Override
	public float calculateInterest() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void creditAmount() {
		// TODO Auto-generated method stub
		
	}

}