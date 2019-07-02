package oops.abstraction.Byinterface;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RBI acc =new HDFC();
		
		acc.creditCard();
		acc.currentAccount();
		acc.debitCard();
		acc.savingAccount();
		
		System.out.println("******************");
		acc= new Axis();
		
		acc.creditCard();
		acc.currentAccount();
		acc.debitCard();
		acc.savingAccount();
		
		
		System.out.println("******************");
		acc= new ICICI();
		
		acc.creditCard();
		acc.currentAccount();
		acc.debitCard();
		acc.savingAccount();
		
		
		
	}

}
