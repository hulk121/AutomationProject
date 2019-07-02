package functions;

public class Overloading {

	public static void main(String[] args) {
      System.out.println(sum(20,30));
      
      int add=sum(10,20,30);
      int add2=sum(10,20);
      System.out.println(add);
      System.out.println(add2);
	}
	
	public static int sum(int a, int b)
	{
		return a+b;
	}
	
	public static int sum(int a, int b, int c)
	{
		return a+b+c;
	}
	
	

}
