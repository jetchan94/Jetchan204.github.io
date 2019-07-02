function Example18() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	/*
	function test(a, b = 3, c = 42) {
		return a + b + c;
	}
	console.log(test(5));
	*/

	// Full ES6 equivalent
	const test = (a, b = 3, c = 42) => a + b + c;
	console.log(test(5));
}