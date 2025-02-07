package u1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class usecase9 {
	
	/*
	 * •	Given a list of numbers, find the duplicate elements using Streams
	 * 

*/
	
	public static void main(String[] args) {
		
		List<Integer> l9 = Arrays.asList(10,12,12,112,11,11,23,34,56);
		
		List<Integer> dist=
		l9.stream()
		.distinct()
		.collect(Collectors.toList());
		System.out.println(dist);
		
		
		
		
		
	}

}
