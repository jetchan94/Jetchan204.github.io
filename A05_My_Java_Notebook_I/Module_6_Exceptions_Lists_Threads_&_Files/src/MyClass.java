// ********** Module 6: Exceptions, Lists, Threads, & Files **********
// ********** MyClass.java **********
public class MyClass {
	public static void main(String[] args) {
		try {
			int a[] = new int[2];
			System.out.println(a[5]);					// a[5] does not exist so...	
		} catch (Exception e) {
			System.out.println("An error occurred");	// catch block is executed
		}
	}
}
// Outputs "An error occurred"