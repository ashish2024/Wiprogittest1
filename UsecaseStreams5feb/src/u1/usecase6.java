package u1;

import java.util.Arrays;
import java.util.List;

public class usecase6 {
	
	
	/*
	 * Find Maximum & Minimum Value
Given a list of numbers, find the maximum and minimum values using Stream API.
	 */

	
	public static void main(String[] args) {
		
		
		List<Integer> l6 = Arrays.asList(1,2,3,4,56,7,8);
		
		
		
		
		int max = l6.stream().reduce(Integer.MIN_VALUE, Integer::max);
		int min = l6.stream().reduce(Integer.MAX_VALUE, Integer::min);

		System.out.println("Maximum Value: " + max);
		System.out.println("Minimum Value: " + min);

		
	}
}
