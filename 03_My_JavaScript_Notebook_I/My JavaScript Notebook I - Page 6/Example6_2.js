function Example2() {
	var myWindow = window.open("", "", "width=400, height=200")
	var courses = new Array(3);
	courses[0] = "HTML";
	courses[1] = "CSS";
	courses[2] = "JS";
	myWindow.document.write(courses[2]);
	
}