// ********** Module 6: Exceptions, Lists, Threads, & Files **********
// ********** MyClass9.java **********
import java.util.ArrayList;
import java.util.Collections;

public class MyClass9 {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("tiger");
		animals.add("cat");
		animals.add("snake");
		animals.add("dog");
		Collections.sort(animals);	// sort alphabetically
		System.out.println(animals + "\n");
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(3);
		nums.add(36);
		nums.add(73);
		nums.add(40);
		nums.add(1);
		Collections.sort(nums);		// sort in order
		System.out.println(nums);
	}
}