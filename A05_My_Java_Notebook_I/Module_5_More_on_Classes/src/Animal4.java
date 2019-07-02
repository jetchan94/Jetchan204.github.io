// ********** Module 5: More on Classes **********
// ********** Animal4.java **********
class Animal4 {
	String name;
	Animal4(String n) {
		name = n;
	}
// Generate hashCode() and equals()	
	@Override
	public int hashCode() { // determines where to store object internally
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) { // semantical equality testing
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal4 other = (Animal4) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}