function Example1() {
	var myWindow = window.open("", "", "width=400,height=200");
	var person = {
		name: "John", age: 31,
		favColor: "green", height: 183
	};
	var x = person.age;
	var y = person['age'];
	
	myWindow.document.write(x);
	myWindow.document.write(y);
}