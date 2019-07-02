function Example8() {
	var myWindow = window.open("", "", "width=400,height=200");
	function person(name, age) {
		this.name= name;  
		this.age = age;
		this.yearOfBirth = bornYear;
	}
	function bornYear() {
		return 2016 - this.age;
	}

	var p = new person("A", 22);
	myWindow.document.write(p.yearOfBirth());
	// Outputs 1994
}