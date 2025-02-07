package u1;

import java.util.Arrays;
import java.util.List;

public class usecase8 {
	
	/*
	 * 
	 * •	Given a list of integers, count how many numbers are greater than 10
	 * 
	 */
	
	public static void main(String[] args) {
		
		List<Integer> l8 = Arrays.asList(1,2,33,11,22,32,42,52);
		
		//long c = l8.stream().filter(x->x>10).count();
		
		System.out.println(l8.stream().filter(x->x>10).count());
	}

}
