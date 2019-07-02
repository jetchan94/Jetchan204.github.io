function Example1() {
	var myWindow = window.open("", "", "width=400, height=200")
	var courses = new Array("HTML", "CSS", "JS");
	myWindow.document.write(courses[10]);
	// Outputs "undefined"
}