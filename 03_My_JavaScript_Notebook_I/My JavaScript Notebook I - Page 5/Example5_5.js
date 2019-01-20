function Example5() {
	var myWindow = window.open("", "", "width=400,height=200");
	function person(name, age) {
		this.name = name;
		this.age = age;
	}
	var John = new person("John", 25);
	var James = new person("James", 21);

	myWindow.document.write(John.age);
}