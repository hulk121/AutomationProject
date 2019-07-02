package exceptionHandling;

public class ExceptionHandlingBySuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=30;

         try{
		System.out.println(b/a);
		
		String str="anand";
		System.out.println(str.charAt(5));
		
        }catch(Exception e){
	       
        	System.out.println("FAil"+e.getMessage());
         }
	}

}
