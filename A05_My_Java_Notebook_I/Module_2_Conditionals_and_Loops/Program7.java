public class Program7 {
    public static void main(String[ ] args) {
	// do...while loop example 1
		System.out.println("do...while loop: (Example 1)");
		int x = 1;
		do {
			System.out.println(x);
			x++;
		} while (x < 5);
			
		/* 
			1
			2
			3
			4
		*/
	
	// do...while loop example 2
		System.out.println("\ndo...while loop: (Example 2)");
		int x1 = 1;
		do {
			System.out.println(x1);
			x1++;
		} while (x1 < 0);
			
		// Outputs 1
		
	// break statement
		System.out.println("\nbreak statement:");
		int x2 = 1;
		while (x2 > 0) {
			System.out.println(x2);
				if (x2 == 4) {
					break;
				}
				x2++;
		}
			
		/* Outputs
		1
		2
		3
		4
		*/

	// continue statement
		System.out.println("\ncontinue statement:");
		for (int x3 = 10; x3 <= 40; x3 = x3 + 10) {
			if (x3 == 30) {
				continue;
			}
			System.out.println(x3);	
		}			
		/* Outputs
			10
			20
			40
		*/		
    }
}