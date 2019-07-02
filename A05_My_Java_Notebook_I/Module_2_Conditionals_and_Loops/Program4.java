public class Program4 {
    public static void main(String[ ] args) {
	// switch statement example
		System.out.println("switch statement:");
		int day = 3;
		
		switch (day) {	// (Expression)
			case 1:
				System.out.println("Monday\n");		// Statements
				break;								// Optional
			case 2:
				System.out.println("Tuesday\n");	// Statements	
				break;								// Optional
			case 3:
				System.out.println("Wednesday\n");	// Statements
				break;								// Optional
		}
		// Outputs "Wednesday"
	
	
	// default statement example
		System.out.println("default statement:");
		int day1 = 1;
		
		switch (day1) {	// (Expression)
			case 6:
				System.out.println("Saturday");		// Statements
				break;								// Optional
			case 7:
				System.out.println("Sunday");		// Statements
				break;								// Optional	
			default:
				System.out.println("Weekday");		// Statements
		}
		// Outputs "Weekday"
    }
}