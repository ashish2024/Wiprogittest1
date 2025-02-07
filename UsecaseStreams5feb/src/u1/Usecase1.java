package u1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Usecase1 {
	
	/*
	 * Find Even Numbers
						Given a list of integers, filter out the even numbers and collect them into a new list.
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> evenNumberl1= l1.stream()
				.filter(x->x%2==0)
				.collect(Collectors.toList());
		
		
		
		l1.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
		
		
		
		System.out.println(evenNumberl1);
		
		
	}
	

}
