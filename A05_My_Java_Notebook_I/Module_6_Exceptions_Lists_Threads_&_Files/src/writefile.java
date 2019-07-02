// ********** Module 6: Exceptions, Lists, Threads, & Files **********
// ********** writefile.java **********
// THIS JAVA FILE CREATES A FILE AND WRITES INSIDE OF IT
import java.util.Formatter;		// used to create content and write to files

public class writefile {
	public static void main(String[] args) {
		try {
			Formatter f = new Formatter("src/test.txt");
			f.format("%s %s %s %s %s %s %n", "Samjat", "Chan", "is", "the", "Big", "Boss!");
			f.format("%s %s %s %s %s %s %n", "He", "has", "conquered", "this", "Java", "course!");
			f.close();
		} catch(Exception e) {
			System.out.println("Error");
		}
	}
}