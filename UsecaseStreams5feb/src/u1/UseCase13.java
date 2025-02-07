package u1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCase13 {

	/*
	 * 
	 *  Group Words by Their Length
•	Given a list of words, group them based on their length.

	 * You can group words by their length using the Collectors.groupingBy() method in the Java Stream API. This will allow you to categorize the words into different groups based on the length of each word.
	 * 
	 */
	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("cow" ,"card","two","seven");
		
		//group by their length using map
		Map<Integer,List<String>>  groupedByLength = str.stream()
				
				
													.collect(Collectors.groupingBy(String::length));
		
		//by using first letter 
		//.collect(Collectors.groupingBy(word -> word.charAt(0)));
		//Print the grouped results 
		groupedByLength.forEach((length,group)->
		System.out.println(length + " " +group));
		
		
		
		
		
	}
}
