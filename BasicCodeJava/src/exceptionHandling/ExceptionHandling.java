package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
	
		
		int a=0;
		int b=30;

         try{
		System.out.println(b/a);
        }catch(ArithmeticException e){
	       
        	System.out.println("FAil"+e.getMessage());
         }
			
		}
	}


