package u1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Usecase2 {
	
	
	/* List f string to upper case */
	
	public static void main(String[] args) {
		
		
		List<String> l2 = Arrays.asList("raj","rk","john","alex");
		System.out.println(l2.stream()
				.map(x->x.toUpperCase())
				.collect(Collectors.toList()));
		//forEach(x->System.out.println(x));
		
		
		
	}
	
	

}
