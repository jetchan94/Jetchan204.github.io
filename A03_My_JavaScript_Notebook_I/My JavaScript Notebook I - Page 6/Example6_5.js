function Example6() {
	var myWindow = window.open("", "", "width=400, height=200")
	var c1 = ["HTML", "CSS"];
	var c2 = ["JS", "C++"];
	var courses = c1.concat(c2); // c1 + c2 = courses	
	myWindow.document.write(courses.length);	// array length returns # of elements 
	// Outputs 3
	
}