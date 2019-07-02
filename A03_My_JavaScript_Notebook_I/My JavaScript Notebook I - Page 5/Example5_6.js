function Example6() {
	var myWindow = window.open("", "", "width=400,height=200");
	var John = {
		name: "John",
		age: 25
	};
	var James = {
		name: "James",
		age: 21
	};

	myWindow.document.write(John.age);
	// Outputs 25
}