// ********** Module 5: More on Classes **********
// ********** Program9.java **********
public class Program9 {
	enum Rank { // define collections of constants
		SOLDIER,
		SERGEANT,
		CAPTAIN
	}
	
	public static void main(String[] args) {
		Rank a = Rank.SOLDIER; // refers to SOLDIER constant
		
		switch(a) {
			case SOLDIER:
				System.out.println("Soldier says hi!");
				break;
			case SERGEANT:
				System.out.println("Sergeant says Hello!");
				break;
			case CAPTAIN:
				System.out.println("Captain says Welcome!");
				break;
		}
	}
	 
}