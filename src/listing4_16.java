
public class listing4_16 {
	public static void main(String[] args) {
		System.out.println("Hello!");
	
		// A was 65
		// Z was 90
		// we want to start at 65 and go to 65 +
		// A is 65 
		// B is going to be 25
		int number =(int)(65 + Math.random()* (25+1));
		System.out.println(number);
		char letter = (char)number;
		System.out.println(letter);
	}

}
