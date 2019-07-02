// ********** Module 5: More on Classes **********
// ********** Program6.java **********
class Program6 {
	public static void main(String[] args) {
		Machine m1 = new Machine() {
			@Override public void start() { // override start()
				System.out.println("Wooooo");
			}
		};
		Machine m2 = new Machine(); // Machine object
		m2.start();
	}
}