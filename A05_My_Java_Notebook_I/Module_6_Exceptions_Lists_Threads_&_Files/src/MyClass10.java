// ********** Module 6: Exceptions, Lists, Threads, & Files **********
// ********** MyClass10.java **********
import java.util.Iterator;
import java.util.LinkedList;

public class MyClass10 {
	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<String>();
		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");
		
	// returns the first element in the list	
		Iterator<String> it = animals.iterator();
		String value = it.next();
		System.out.println(value + "\n");
		
	// iterator moves to the next element in the list	
		while(it.hasNext()) {
			String text = it.next();
			System.out.println(text);
		}
	}
}