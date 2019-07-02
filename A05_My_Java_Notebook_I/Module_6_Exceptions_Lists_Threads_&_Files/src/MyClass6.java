// ********** Module 6: Exceptions, Lists, Threads, & Files **********
// ********** MyClass6.java **********
import java.util.LinkedList;

public class MyClass6 {
	public static void main(String[] args) {
		LinkedList<String> c = new LinkedList<String>();
		c.add("Red");
		c.add("Blue");
		c.add("Green");
		c.add("Orange");
		c.remove("Green");
		System.out.println(c + "\n");
	
		for(String s: c) {
			System.out.println(s);
		}
	}
}