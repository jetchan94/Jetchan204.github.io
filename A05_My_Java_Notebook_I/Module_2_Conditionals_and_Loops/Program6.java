public class Program6 {
    public static void main(String[ ] args) {
	// for loop example (True)
		System.out.println("for loop:");
		for (int x = 1; x <= 5; x++) {
			System.out.println(x);
		}

		/* Outputs 
			1
			2
			3
			4
			5
		*/
	
	// for loop example (even values)
		System.out.println("\nfor loop: (even values)");
		for (int x = 0; x <= 10; x = x + 2) {
			System.out.println(x);
		}

		/*  
			2
			4
			6
			8
			10
		*/
    }
}