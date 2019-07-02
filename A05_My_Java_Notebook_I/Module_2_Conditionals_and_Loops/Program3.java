public class Program3 {
    public static void main(String[ ] args) {
	// nested if statement example
		System.out.println("nested if statement:");
		int age = 22;
		int money = 800;
		
		if (age > 18) {
			if (money > 500) {
				System.out.println("Welcome!\n");
			}
		}
		
	// if statement with AND logical operator (&&)	
		System.out.println("if statement with AND operator:");
		if (age > 18 && money > 500) {
			System.out.println("Welcome!\n");
		}
		
	// if statement with OR logical operator (||)	
		System.out.println("if statement with OR operator:");	
		int age1 = 25;
		int money1 = 100;	
		
		if (age1 > 18 || money1 > 500) {
			System.out.println("Welcome!\n");	
		} 
		// Outputs "Welcome!"
		
	// if statement with NOT logical operator (!)	
		System.out.println("if statement with NOT operator:");	
		if (!(age1 > 26 )) {
			System.out.println("Too Young");
		}	else {
			System.out.println("Welcome!");
		}
		// Outputs "Too Young"	
    }
}