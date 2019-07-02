function Example2() {
	var myWindow = window.open("", "", "width=400,height=200");
	var course = {name: "JS", lessons: 41};	
	myWindow.document.write(course.name.length);
	// Outputs 2
}