package u1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class useCase10 {
	
	/*
	 * Find Duplicate Elements
•	Given a list of numbers, find the duplicate elements using Streams

	 * 
	 */
public static void main(String[] args) {
	
	
	List<Integer> l10 = Arrays.asList(10,20,20,30,40,40);
	
	
	/*
	 * System.out.println(
	 * 
	 * l10.stream() .collect(Collectors.groupingBy(x->x,Collectors.counting()))
	 * .entrySet() .stream() .filter(x->x.getValue()>1) .map(Map.Entry::getKey)
	 * .collect(Collectors.toList())
	 * 
	 * );
	 */
	
	Set<Integer> seen = new HashSet<>();
	Set<Integer> duplicates = l10.stream().filter(x->!seen.add(x))
			.collect(Collectors.toSet());
	System.out.println(duplicates);
	
				
}
}
