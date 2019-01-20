function Example12() {
	var myWindow = window.open('', '', 'width=500, height=200')
	
	//Thu Jan 01 1970 19:00:00
	var d1 = new Date(86400000); 

	//Fri Jan 02 2015 10:42:00
	var d2 = new Date("January 2, 2015 10:42:00");

	//Sat Jun 11 1988 11:42:00
	var d3 = new Date(88,5,11,11,42,0,0);
	
	myWindow.document.write(d1);
		
}