function Example4() {
	var myWindow = window.open("", "", "width=400,height=200");
	function person(name, age, color) {
		this.name = name;
		this.age = age;
		this.favColor = color;
	}

	var p1 = new person("John", 42, "green");
	var p2 = new person("Amy", 21, "red");

	myWindow.document.write(p1.age); // Outputs 42
	myWindow.document.write(p2.name); // Outputs "Amy"	
}