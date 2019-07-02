class MyClass1 {
	
// ********************************************************************	
// ---------- sum() Method ----------								  *		
	static int sum(int val1, int val2) { 	//						  *		
		return val1 + val2;					//						  *	
	}										//						  *
											//						  *
// ---------- returnFive() Method: returns an int value 5 ----------  *	
	static int returnFive() {				//						  *	
		return 5;							//						  *	
	}										//						  *
//																	  *						
// ---------- sayHelloTo() Method: has a parameter ----------		  *
	static void sayHelloTo(String name) {	//						  *
		System.out.println("Hello " + name);//						  *	
	}										//						  *
//																	  *		
// ---------- sayHello() Method ----------							  *
	static void sayHello() {				//						  *
		System.out.println("Hello World!");	//						  *
	}										//						  *
//																	  *			
// ---------- max() Method ----------							  	  *	
	static int max(int a, int b) {			//						  *	
		if (a > b) {						//						  *
			return a;						//						  *
		}									//						  *		
		else {								//						  *
			return b;						//						  *
		}									//						  *	
	}										//						  *
//*********************************************************************	

// ---------- main Method ----------										
	public static void main(String[] args) {
		int x = sum(2, 5);
		int res = max(7, 42);
		System.out.println(x);				// 7
		System.out.println("");
		System.out.println(returnFive());	// 5
		System.out.println("");
		sayHelloTo("Bro");					// Hello Bro
		System.out.println("");
		sayHello();							// Hello World!
		System.out.println("");
		System.out.println(res); 			// 42
	}

}