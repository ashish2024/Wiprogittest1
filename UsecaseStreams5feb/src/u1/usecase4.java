package u1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class usecase4 {
	
	/*
	 * Square Each Number in a List Given a list of numbers, return a new list
	 * containing the square of each number.
	 */
	
	public static void main(String[] args) {
		
		List<Integer> l4 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(
		
			l4.stream()
			.map(x->x*x)
			.collect(Collectors.toList())
			
		);	
				
				
				
				
				
		
		
	}
	
	

}
