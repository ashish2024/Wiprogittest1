package u1;

import java.util.Arrays;
import java.util.List;

public class usecase5 {
	
	
	/*
	 * Sum of All Elements
Given a list of numbers, find their sum using reduce().
	 */
	
	public static void main(String[] args) {
		
		
		List<Integer> l5 = Arrays.asList(1,2,3,4,5);
		
		System.out.println(l5);
		
		int s = 
		
		l5.stream().reduce(0,(a,b)->a+b);
		
		System.out.println(s);
		
	
		
		
		
	}

}
