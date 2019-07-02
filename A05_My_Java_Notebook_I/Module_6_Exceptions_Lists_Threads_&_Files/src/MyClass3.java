// ********** Module 6: Exceptions, Lists, Threads, & Files **********
// ********** MyClass3.java **********
public class MyClass3 {
	public static void main(String[] args) {
	// Checked Exception 	
		try {
			Thread.sleep(1000);					// Pause this Thread for 1 second			
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt(); // Here!
			throw new RuntimeException(e);		// We found it in true status, cleared it, set it back to true, and threw a runtime exception.
		}
		System.out.println("Here!");
	}
}