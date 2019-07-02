function Example5() {
	var myWindow = window.open('', '', 'width=400, height=200')

	//calling the function in window.onload to make sure the HTML is loaded
	window.onload = function() {
		var parent = document.getElementById("demo");
		var child = document.getElementById("p1");
		parent.removeChild(child);
};

	//myWindow.document.write(t);	
}
