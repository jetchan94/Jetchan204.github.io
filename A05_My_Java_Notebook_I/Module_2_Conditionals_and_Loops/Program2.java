public class Program2 {
    public static void main(String[ ] args) {
	// else if statement example
		System.out.println("else if statement:");
		int age = 25;
		
		if (age <= 0) {
			System.out.println("Error");
		}	else if (age <= 16) {
				System.out.println("Too Young");				
		} 	else if (age < 100) {
				System.out.println("Welcome!");
		} else {
			System.out.println("Really?");
		}	
		// Outputs "Welcome!"	
    }
}