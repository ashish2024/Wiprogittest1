package u1;

import java.util.stream.Collectors;

public class UseCase14 {
	/*
	 *Find the First Non-Repeating Character in a String
•	Given "aabbcdeff", return 'c' (first unique character).
 
	 *
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		/*
		 * 
		 * To find the first non-repeating character in a string, you can use the Stream API to process the string in a couple of ways. One efficient approach is to count the frequency of each character and then identify the first character with a count of 1 (non-repeating).
		 */
		
		String inp = "aabbcdeff";
		//find first non repeating character
		
		inp.chars()
		.mapToObj(x->(char))
		.collect(Collectors.groupingBy(c->c,LinkedHashMap::new , Collectors.counting()))
		.entrySet()
		.stream()
	
		.filter
		 .filter(entry -> entry.getValue() == 1) // Find non-repeating characters
         .map(Map.Entry::getKey) // Extract the character
         .findFirst(); // Get the first o
		
		
	}

}
