
public class listing4_16 {
	public static void main(String[] args) {
	
		int startingValue = 65; 
	// A was 65, our starting value
	
        int endingValue = 90 -65 +1;
	// Z was 90 but Math.random excludes the upper limit, so we added one
	// more to ensure it include Z in the possible output
		
		System.out.println((char)(startingValue + Math.random()* (endingValue)));
	}

}
