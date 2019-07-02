package stringclass;

public class Testing {

	public static void main(String[] args) {

		
		String name="Kalyani";
		String name2="kalyani";
		
		//charAt
		System.out.println(name.charAt(4));
		
		//Equals
		if(name.equals(name2)){
			
			System.out.println("name and name2 are same");
		}
		else{
			System.out.println("not same");
		}
		
		//EqualIgnoreCAse
        if(name.equalsIgnoreCase(name2)){
			
			System.out.println("name and name2 are same");
		}
		else{
			System.out.println("not same");
		}
        
        //length
        System.out.println(name.length());
        
        //replace
        System.out.println(name.replace("ly", "ya"));
        System.out.println(name.replace('a', 'n'));
        
        //split
        String[] arr =name.split("a");
        System.out.println(arr.length);
       // System.out.println(arr);
         for(String s : arr)
         {
        	 System.out.println(s);
         }
         String name3="wer";
        // for(int i=0; i<name3.length(); i++)
        // {
        //	 System.out.print(name(i));
        // }
         
         
         //Substring
         System.out.println(name.substring(2));
         System.out.println(name.substring(2,7));
         
         System.out.println(name.toLowerCase());
         System.out.println(name.toUpperCase());
	}

}
