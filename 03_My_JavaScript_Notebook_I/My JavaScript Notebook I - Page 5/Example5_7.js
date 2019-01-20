function Example7() {
	var myWindow = window.open("", "", "width=400,height=200");
	function person(name, age) {
	this.name = name;  
	this.age = age;
	this.changeName = function (name) {
		this.name = name;
		}
	}

	var p = new person("David", 21);
	p.changeName("John");
	//Now p.name equals to "John"
	
	myWindow.document.write(p.name);
}