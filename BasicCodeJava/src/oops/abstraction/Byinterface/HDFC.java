package oops.abstraction.Byinterface;

public class HDFC implements RBI{
	@Override
	public void savingAccount() {

		System.out.println("Saving acc in HDFC");
		
	}

	@Override
	public void currentAccount() {
		
		System.out.println("current acc in HDFC");


	}

	@Override
	public void debitCard() {

		System.out.println("Debit card from HDFC");

	}

	@Override
	public void creditCard() {


		System.out.println("Credit card from HDFC");
	}

}
