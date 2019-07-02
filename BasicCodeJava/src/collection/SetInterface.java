package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		/*
		HashSet<String> set1= new HashSet<>();
		 set1.add("kalyani");
		 set1.add("kalyani");

		 set1.add("kalyani");

		 for(String s:set1)
		 {
			 System.out.println(s);
		 }*/
		 
		/* HashSet<String> set2= new HashSet<>();
		 set2.add("Anand");
		 set2.add("Bhayre");
		 set2.add("TechB");
		 set2.add("Anand");

		 for(String str:set2)
		 {
			 System.out.println(str);
		 }*/
		
		 Set<String> set2= new HashSet<>();
		 set2.add("Anand");
		 set2.add("Bhayre");
		 set2.add("TechB");
		 set2.add("Anand");

		 for(String str:set2)
		 {
			 System.out.println(str);
		 }
		 
		 System.out.println("****************");
		
		 set2= new LinkedHashSet<>();
		 set2.add("Anand");
		 set2.add("Bhayre");
		 set2.add("TechB");
		 set2.add("Anand");

		 for(String str:set2)
		 {
			 System.out.println(str);
		 }
		 
		 System.out.println("****************");
		 
		 set2= new TreeSet<>();
		 set2.add("Anand");
		 set2.add("Bhayre");
		 set2.add("TechB");
		 set2.add("Anand");

		 for(String str:set2)
		 {
			 System.out.println(str);
		 }

	}

}
