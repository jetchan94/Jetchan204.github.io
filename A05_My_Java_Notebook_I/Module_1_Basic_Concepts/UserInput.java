import java.util.Scanner;

class UserInput {
    public static void main(String[ ] args) {
    // Scanner intialization    
		Scanner inputInfo = new Scanner(System.in);
			System.out.println("What is your name?");				// Prints Question 1
				String inputName = inputInfo.nextLine(); 			// User inputs name
			System.out.println("What high school did you attend?"); // Prints Question 2
				String inputSchool = inputInfo.nextLine(); 			// User inputs school
			System.out.println("How old are you?");					// Prints Question 3
				String inputAge = inputInfo.nextLine();				// User inputs age
			System.out.println("My name is " + inputName + " and I attended "
				+ inputSchool + ". " + "I am currently "
				+ inputAge + " years old.");	
    }
}