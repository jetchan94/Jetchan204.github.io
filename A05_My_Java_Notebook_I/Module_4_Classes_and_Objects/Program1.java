// ********** Program1.java **********
class Program1 {
	public static void main(String[] args) {
		// color will be "Red"
		Vehicle2 v1 = new Vehicle2();
		
		// color will be "Green"
		Vehicle2 v2 = new Vehicle2("Green");
		
		System.out.println(v1.getColor());
		System.out.println(v2.getColor());
	}
}