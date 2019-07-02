// ********** Module 6: Exceptions, Lists, Threads, & Files **********
// ********** MyClass7.java **********
import java.util.HashMap;

public class MyClass7 {
	public static void main(String[] args) {
		HashMap<String, Integer> points = new HashMap<String, Integer>();
		points.put("Amy", 154);
		points.put("Dave", 42);
		points.put("Rob", 733);
		System.out.println(points.get("Dave"));	// access the value in "Dave"
	}
}