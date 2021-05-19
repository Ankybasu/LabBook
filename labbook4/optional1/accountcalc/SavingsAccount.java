package accountcalc;

public class SavingsAccount extends Account{
	private final int minimumBalance=500;
	@Override
	public void withdraw(double amount) {
		if(super.getBalance()>minimumBalance) {
			double amt=super.getBalance()-amount;
			super.setBalance(amt);
		}
		else {
			System.out.println("Exceeded overdraft limit!");
		}
	}
}
