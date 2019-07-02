// ********** Module 6: Exceptions, Lists, Threads, & Files **********
// ********** Program.java **********
public class Program {
	// throws corresponding exception with a custom message
		static int div(int a, int b) throws ArithmeticException {
			if(b == 0) {
				throw new ArithmeticException("Division by Zero");
			} else {
				return a / b;
			}
		}
		
		public static void main(String[] args) {
			System.out.println(div(42, 0));
		}
}