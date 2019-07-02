class MyClass {
	
// ---------- sayHello() Method ----------	
	static void sayHello() {
		System.out.println("Hello World!");
	}

// ---------- sayHello(String name) Method ----------	
	static void sayHello(String name) {
		System.out.println("Hello " + name);
	}	
	
// ---------- Main Method ----------	
	public static void main(String[] args) {
		sayHello();			// Call out to sayHello() Method
		sayHello();
		sayHello();
		System.out.println("");
		sayHello("David");	// Call out to sayHello(String name) Method
		sayHello("Amy");	// Call out to sayHello(String name) Method
	}
}


