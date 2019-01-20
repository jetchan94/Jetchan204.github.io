function Example57() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	setTimeout(function() {
		console.log("Work 1");
		setTimeout(function() {
			console.log("Work 2");
		}, 1000);
	}, 1000);
	console.log("End");
}