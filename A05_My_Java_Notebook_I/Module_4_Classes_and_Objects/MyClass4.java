// ********** MyClass4.java **********
public class MyClass4 {
	public static void main(String[] args) {
		int x = 5;
		addOneTo(x);			// call addOneTo method
		System.out.println(x);	// Outputs "5"
		
		Person j;				// constructor
		j = new Person("John");	// new Person object
		j.setAge(20);			
		celebrateBirthday(j);	 
		System.out.println(j.getAge());	// Outputs "21"
	}
	
	// addOneTo method
	static void addOneTo(int num) {
		num = num + 1;
	}
	
	// celebrateBirthday method
	static void celebrateBirthday(Person p) {
		p.setAge(p.getAge() + 1);	
	}
}