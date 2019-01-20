function Example58() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	function asyncFunc(work) {
		return new Promise(function(resolve, reject) {
			if (work === "")
				reject(Error("Nothing"));
			setTimeout(function() {
				resolve(work);
			}, 1000);
		});
	}

	asyncFunc("Work 1") // Task 1
	.then(function(result) {
		console.log(result);
		return asyncFunc("Work 2"); // Task 2
	}, function(error) {
		console.log(error);
	})
	.then(function(result) {
		console.log(result);
	}, function(error) {
		console.log(error);
	});
	console.log("End");
}