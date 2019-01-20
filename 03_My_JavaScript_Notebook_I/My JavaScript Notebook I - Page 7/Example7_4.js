function Example4() {
	var myWindow = window.open('', '', 'width=400, height=200')

	//calling the function in window.onload to make sure the HTML is loaded
	window.onload = function() {
		//creating a new paragraph
		var p = document.createElement("p");
		var node = document.createTextNode("Some new text");
		//adding the text to the paragraph
		p.appendChild(node);

		var div = document.getElementById("demo");
		//adding the paragraph to the div
		div.appendChild(p);
	};

	//myWindow.document.write(t);	
}
