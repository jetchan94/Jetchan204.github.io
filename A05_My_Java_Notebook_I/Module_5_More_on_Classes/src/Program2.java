// ********** Module 5: More on Classes **********
// ********** Program2.java **********
class Program2 {
	static double max(double a, double b) { 
		if(a > b) {
			return a;
		}
		else {
			return b;
		}
	}
	static int max(int a, int b) {
		if(a > b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		Cat c = new Cat(); // Cat1.java	
		c.makeSound();
		
		System.out.println("\n" + max(8, 17));
		System.out.println(max(3.14, 7.68));
	}
}	