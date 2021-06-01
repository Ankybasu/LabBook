package capgemini.com.atmsystem;

public class CardScanner extends ATMCard{
	public boolean acceptCard(long cardId) {
		for(BankCustomer bc: details) {	
			if(bc.getCard().getCardId()==cardId) {
				return true;
				}
			}
			return false;
		
	}
	void ReadCard(){
		System.out.println("Enter pin: ");
		int pin=sc.nextInt();
		for(BankCustomer bc: details) {	
			if(bc.getCard().getPIN()==pin) {
				bc.getCard().AcceptAmount(bc); 
				CardDispenser cd=new CardDispenser();
				System.out.println("Want to generate receipt? ");
				String str=sc.next();
				if(str.equalsIgnoreCase("yes")) {
					cd.generateReceipt(bc);
				}
				else {
					System.out.println("Cash not available!");
				}
				
				}
			}
	}
	void ejectCard() {
		System.out.println("Remove your card");

	}
	void validatePin(){
	}
}
