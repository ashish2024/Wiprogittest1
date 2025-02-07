package u1;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UseCase12 
{
	/*
	 * 
	 * Find the Second-Highest Number
•	Given a list of numbers, find the second-highest value.

	 * 
	 */
	
	public static void main(String[] args) {
		
		List<Integer> l12 = Arrays.asList(10,12,20);
		
		Optional<Integer> ans = l12.stream()
				             .distinct() // Remove duplicates
				             .sorted((a,b)->b.compareTo(a)) // Sort in descending order
				             .skip(1)  // Skip the highest number
				             .findFirst();  // Get the first element (second-highest)
		
		System.out.println(ans.orElse(1));
	}
	
}