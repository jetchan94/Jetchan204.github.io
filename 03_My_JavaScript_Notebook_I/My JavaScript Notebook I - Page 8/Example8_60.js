function Example60() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	function* idMaker() {
		let index = 0;
		while (index < 5)
			yield index++;
	}
	var gen = idMaker();

	console.log(gen.next().value);
	console.log(gen.next().value);
	console.log(gen.next().value);
	console.log(gen.next().value);
	console.log(gen.next().value);
	// Try to add one more console.log, just like the above see what happens.
}