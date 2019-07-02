// ********** Module 5: More on Classes **********
// ********** Robot.java **********
class Robot {
	int id;
	Robot(int i) {
		id = i; 
		Brain b = new Brain(); // Brain object
		b.think();		
	}
	
	private class Brain {
		public void think() {
			System.out.println(id + " is thinking");
		}
	}
}