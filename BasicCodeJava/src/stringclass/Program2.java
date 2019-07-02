package stringclass;

public class Program2 {

	public static void main(String[] args) {


		/*String name="anand";
		char letter='a';
		int count=0;
		for(int i=0; i<name.length();i++)
		{
			char character=name.charAt(i);
			
			if(letter == character)
			{
				count=count+1;
			}
		}	
		System.out.println("total no. of a in name="+count);
*/
		
		/*String name="anand";
		String c1="a";
		int count=0;
		
		for(int i=0; i<name.length(); i++)
		{
			if(c1.equals(name.substring(i, i+1)))
					{
				count++;
				
					}
		}
		System.out.println("total no. of a in name="+count);*/
		
		String name="anand";
		System.out.println(name.length()-name.replace("a","").length());
	}

}
