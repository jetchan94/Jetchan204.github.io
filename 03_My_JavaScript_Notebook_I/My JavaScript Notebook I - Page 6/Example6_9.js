function Example9() {
	var myWindow = window.open("", "", "width=400, height=200")
	var number = Math.sqrt(4);
	//document.write(number);
	//Outputs 2
	
	myWindow.document.write(number); 
}