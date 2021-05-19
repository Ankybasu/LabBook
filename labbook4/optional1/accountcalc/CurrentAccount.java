package accountcalc;

public class CurrentAccount extends Account{
	private double overdraftLimit=super.getBalance();
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount<overdraftLimit) {
			double amt=super.getBalance()-amount;
			super.setBalance(amt);
		}
		else {
			System.out.println("Exceeded limit");
		}
	}
	
}
