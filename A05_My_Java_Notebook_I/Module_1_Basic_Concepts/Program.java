public class Program {
    public static void main(String[ ] args) {
    /* Addition */
	int sum1 = 50 + 10;
	int sum2 = sum1 + 66;
	int sum3 = sum2 + sum2;	
	
	/* Subtraction */
	int diff1 = 1000 - 10;
	int diff2 = diff1 - 5;
	int diff3 = diff1 - diff2;
	
	/* Multiplication */
	int prod1 = 1000 * 2;
	int prod2 = prod1 * 10;
	int prod3 = prod1 * prod2;
	
	/* Division */
	int div1 = 1000 / 2;
	int div2 = div1 / 2;
	int div3 = div1 / div2;
	
	/* Modulo */	
    int value = 23;
	int res = value % 6; // res is 5
	
		System.out.println("Addition:" + "\n" + sum1 + "\n" + sum2 + "\n" + sum3 +
			"\n\n" + "Subtraction:" + "\n" + diff1 + "\n" + diff2 + "\n" + diff3 +
			"\n\n" + "Multiplication:" + "\n" + prod1 + "\n" + prod2 + "\n" + prod3 +
			"\n\n" + "Division:" + "\n" + div1 + "\n" + div2 + "\n" + div3 +
			"\n\n" + "Modulo:" + "\n" + value + "\n" + res);
    }
}