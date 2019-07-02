// ********** Module 6: Exceptions, Lists, Threads, & Files **********
// ********** MyClass11.java **********
import java.io.File;

public class MyClass11 {
	public static void main(String[] args) {
		File x = new File("arraylist.JPG");
		if(x.exists()) {
			System.out.println(x.getName() + " exists!");
		}
		else {
			System.out.println("The file does not exist.");
		}
	}
}