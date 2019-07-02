// ********** Program2.java **********
class Program2 {
	public static void main(String[] args) {
		// returns the absolute value of its parameter
		int a = Math.abs(10);	// 10
		int b = Math.abs(-20);	// 20
		// rounds a floating point value up to the nearest integer value
		double c = Math.ceil(8.825);
		// rounds a floating point value down to the nearest integer value
		double d = Math.floor(11.225);
		// returns the largest parameter
		int e = Math.max(23, 35);
		// returns the smallest parameter
		int f = Math.min(33, 45);
		// takes two parameters and returns the first parameter raised to the power of the second parameter
		double g = Math.pow(5, 3);
		
		System.out.println("abs(10) = " + a);
		System.out.println("abs(-20) = " + b);
		System.out.println("ceil(8.825) = " + c);
		System.out.println("floor(11.225) = " + d);
		System.out.println("max(23, 35) = " + e);
		System.out.println("min(33, 45) = " + f);
		System.out.println("pow(5, 3) = " + g);
	}
}