// Person.java
// ********** Person class **********
public class Person {
	private String name; // Accessible only within the Person class
	private int age;	 // Accessible only within the Person class	
	
	// constructor for name and age
	Person (String n) {
		this.name = n;
	}
	
	// getAge() - returns the value of age
	public int getAge() {
		return age;
	}
	
	// setAge() - takes parameter "a" of type int and assigns it to this.age
	public void setAge(int a) {
		this.age = a;
	}
}