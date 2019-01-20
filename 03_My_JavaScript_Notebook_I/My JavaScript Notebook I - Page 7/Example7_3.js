function Example3() {
	var myWindow = window.open('', '', 'width=400, height=200')

	//calling the function in window.onload to make sure the HTML is loaded
	window.onload = function() {
		var x = document.getElementById("demo");
		x.style.color = '#6600FF';
		x.style.width = '100px';
	};

	//myWindow.document.write(t);	
}
