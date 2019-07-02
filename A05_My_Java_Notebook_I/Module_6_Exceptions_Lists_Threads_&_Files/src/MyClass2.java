// ********** Module 6: Exceptions, Lists, Threads, & Files **********
// ********** MyClass2.java **********
// 2. Implementing the Runnable interface
class MyClass2 {
	public static void main(String[] args) {
		Thread t = new Thread(new Loader());
		t.start();
	}
}