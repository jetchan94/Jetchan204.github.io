public class Program5 {
    public static void main(String[ ] args) {
	// while loop example (True)
		System.out.println("while loop: (true result)");
		int x = 3;
		
		while (x > 0) {
			System.out.println(x);
			x--;
		}
		/* Outputs 
			3
			2
			1
		*/
	
	// while loop example (False)
		System.out.println("\nwhile loop: (false result)");
		int x1 = 6;
		
		while (x1 < 10) {
			System.out.println(x1);
			x1++;
		}
		System.out.println("Loop ended");	
		
		/*  
			6
			7
			8
			9
			Loop ended
		*/
    }
}