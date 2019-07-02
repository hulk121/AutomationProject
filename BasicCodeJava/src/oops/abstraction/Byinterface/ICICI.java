package oops.abstraction.Byinterface;

public class ICICI implements RBI {
	
	@Override
	public void savingAccount() {

		System.out.println("Saving acc in ICICI");
		
	}

	@Override
	public void currentAccount() {
		
		System.out.println("current acc in ICICI");


	}

	@Override
	public void debitCard() {

		System.out.println("Debit card from ICICI");

	}

	@Override
	public void creditCard() {


		System.out.println("Credit card from ICICI");
	}

}
