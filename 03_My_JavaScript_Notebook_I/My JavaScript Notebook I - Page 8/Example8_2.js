function Example2() {
	function varTest() {
		var x = 1;
		if (true) {
			var x = 2;  // same variable
			console.log(x);  // 2
		}
		console.log(x);  // 2
	}

	function letTest() {
		let x = 1;
		if (true) {
			let x = 2;  // different variable
			console.log(x);  // 2
		}
		console.log(x);  // 1
	}

	varTest();	// call out to varTest function
	letTest();	// call out to letTest function
}