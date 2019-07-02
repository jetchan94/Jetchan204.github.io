// ********** Vehicle2.java **********
// ********** Vehicle class **********	
public class Vehicle2 {
	private String color;
		
	Vehicle2() {
		this.setColor("Red");
	}
	Vehicle2(String c) {
		this.setColor(c);
	}
		
	// Setter (method) - takes a parameter and assigns it to the attribute
	public void setColor(String c) {
		this.color = c;
	}
	
	// Getter (method) - returns the value of the attribute
	public String getColor() {
		return color;
	}
}