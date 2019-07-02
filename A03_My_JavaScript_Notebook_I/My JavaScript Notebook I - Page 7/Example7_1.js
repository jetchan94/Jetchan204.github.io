function Example1() {
	var myWindow = window.open('', '', 'width=400, height=200')

		function setText() {
			var a = document.getElementById("demo");
				var arr = a.childNodes;
				for(var x=0;x<arr.length;x++) {
					arr[x].innerHTML = "new text";
			}
		}

//calling the function with setTimeout to make sure the HTML is loaded
		setTimeout(setText, 500);

	//myWindow.document.write(t);
		
}
