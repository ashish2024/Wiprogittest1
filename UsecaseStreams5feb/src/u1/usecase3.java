package u1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class usecase3 {
	
	/*
	 * 3️⃣ Find Names Starting with "A" Given a list of names, filter out the ones
	 * that start with 'A'.
	 */
	
	public static void main(String[] args) {
		
		List<String> l3 = Arrays.asList("Raj", "Ashish","Akash");
		
		System.out.println(
		l3.stream().filter(x->x.startsWith("A"))
		.collect(Collectors.toList())
		
		
		);
		
		
		
	}
			 
			 

}
