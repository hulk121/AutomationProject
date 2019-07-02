package oops.abstraction.Byinterface;

public class Axis implements RBI {

	@Override
	public void savingAccount() {

		System.out.println("Saving acc in Axis bank");
		
	}

	@Override
	public void currentAccount() {
		
		System.out.println("current acc in Axis bank");


	}

	@Override
	public void debitCard() {

		System.out.println("Debit card from Axis bank");

	}

	@Override
	public void creditCard() {


		System.out.println("Credit card from Axis bank");
	}

}
