// ********** Module 6: Exceptions, Lists, Threads, & Files **********
// ********** readfile.java **********
// THIS JAVA FILE READS THE CONTENT OF A FILE
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readfile {
	public static void main(String[] args) {
		try {
			File x = new File("src/test.txt");	
			Scanner sc = new Scanner(x);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());	// prints whole line instead of string by string
			}
			sc.close();
		} catch(FileNotFoundException e) {
			System.out.println("Error");
		}
	}
}