package conditionalStatements;

public class Class1 {

	public static void main(String[] args) {
	     
		int a=10;
		int b=20;
		int c=30;
		
		// AND operator
		if(b>a && b>c)
		{
			System.out.println("bis greatest");
		}

		else if(a>c && a>b)
		{
			System.out.println("ais greatest");
		}
		else
		{ 
			System.out.println("c is greatest");
			
		}
		
		// OR operator
		
		int age=30;
		if(age>60 || age<8)
		{
			System.out.println("eligible for benefit");
		}
		else
		{
			System.out.println("not eligible");
		}
	}

}
