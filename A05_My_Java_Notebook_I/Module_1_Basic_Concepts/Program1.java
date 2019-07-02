public class Program1 {
    public static void main(String[ ] args) {
    /* Increment */
	int test = 5;
	++test; // test is now 6	
	
	/* Decrement */
	int test1 = 5;
	--test1; // test1 is now 4
	
	/* Prefix */
	int x = 34;
	int y = ++x; // y is now 35
	
	/* Postfix */
	int x1 = 34;
	int y1 = x1++; // y1 is 34
	
	/* Addition and assignment (+=) */	
    int num1 = 4;
	int num2 = 8; 
	num2 += num1; // num2 = num2 + num1;
	// num2 is 12 and num1 is 4
	
	/* Subtraction and assignment (-=) */	
    int num3 = 4;
	int num4 = 8; 
	num4 -= num3; // num4 = num4 - num3;
	// num4 is 4 and num3 is 4
	
		System.out.println("Increment:" + "\n" + "test =" + " " + test + 
			"\n\n" + "Decrement:" + "\n" + "test1 =" + " " + test1 + 
			"\n\n" + "Prefix:" + "\n" + "x =" + " " + x + "\n" + "y =" + " " + y +
			"\n\n" + "Postfix:" + "\n" + "x1 =" + " " + x1 + "\n" + "y1 =" + " " + y1 + 
			"\n\n" + "Addition and assignment (+=):" + "\n" + "num1 =" + " " + num1 + 
				"\n" + "num2 =" + " " + num2 +
			"\n\n" + "Subtraction and assignment (-=):" + "\n" + "num3 =" + " " + num3 + 
				"\n" + "num4 =" + " " + num4);
    }
}