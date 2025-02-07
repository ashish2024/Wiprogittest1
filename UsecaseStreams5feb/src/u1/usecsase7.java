package u1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class usecsase7 
{
	
	
	/*
	 * Sort a List of Strings
Sort a given list of strings in ascending and descending order.
 
	 * 
	 * 
	 */
	
	public static void main(String[] args)
	{
		
		
		
		
		List<String> l7 = Arrays.asList("asd","yellow","zakirs","sdfddghjhg","pddfd","dfs");
		//ascending order
		
		System.out.println(
		l7.stream()
		.sorted()
		.collect(Collectors.toList())
		);

		
		//decsending order
		
		
		System.out.println(
				
		l7.stream()
		.sorted((a,b)->b.compareTo(a))
		.collect(Collectors.toList()));
		
		
		System.out.println(
				
				l7.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList())
				
				
				);
		
		
		
	}	
	

}
