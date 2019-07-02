function Example14() {
	var myWindow = window.open('', '', 'width=400, height=200')
	
	function printTime() {
		var d = new Date();
		var hours = d.getHours();
		var mins = d.getMinutes();
		var secs = d.getSeconds();
		myWindow.document.body.innerHTML = hours+":"+mins+":"+secs;
	}
	setInterval(printTime, 1000)

	//myWindow.document.write(t);
		
}