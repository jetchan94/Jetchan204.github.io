function Example3() {
	var myWindow = window.open("", "", "width=400, height=200");
	
	for (let i = 0; i < 3; i++) {
		myWindow.document.write(i);
	}
}