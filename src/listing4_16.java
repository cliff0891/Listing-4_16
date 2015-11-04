
public class listing4_16 {
	public static void main(String[] args) {
		
		// 'A' is 65
		int startingValue = 65;
		
		/* 'Z' is 90,
		and we wanted to cover the range, so we added 1 more to ensure
		we would cover A through Z.*/
		int endingValue = 90-startingValue+1;
	   
		/* From page 122 a + Math.random()*b gives us a random
		 * number between a and a+b excluding a+b.*/
		
		/* Make a new variable and then 
		fill it with a random number that is between our starting value
		and ending value. Then print it out. */
		int randomNumber;
		System.out.println("The random uppercase letter is:");
		 // Generate a random number
		randomNumber = (int)(startingValue + Math.random()*endingValue);
	    // recast the number to a letter.
		char letter = (char)randomNumber; 	
		// print it out.
		System.out.println(letter); 		

	}

}