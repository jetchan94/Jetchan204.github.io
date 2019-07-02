function Example13() {
	var myWindow = window.open('', '', 'width=400, height=200')
	
	var d = new Date();
	var hours = d.getHours();

	myWindow.document.write(hours);
		
}