function Example3() {
	var myWindow = window.open("", "", "width=400, height=200")
	var courses = new Array();
	courses[0] = "HTML";
	courses[1] = "CSS";
	courses[2] = "JS";
	courses[3] = "C++";
	myWindow.document.write(courses[3]);
	
}