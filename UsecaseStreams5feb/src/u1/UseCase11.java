package u1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase11 {
	/*
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		List<List<Integer>> ns11 = Arrays.asList(
				
				Arrays.asList(10,101,200),
				Arrays.asList(201,202,203),
				Arrays.asList(201,202,203));
		
		//falten using 
		
	List<Integer> flt = 	ns11.stream()
		.flatMap(x->x.stream())
		.collect(Collectors.toList());
	System.out.println(flt);
	}

}
