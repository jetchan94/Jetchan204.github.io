function Example39() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	function myFunction(w, x, y, z) {
		console.log(w + x + y + z);
	}
	var args = [1, 2, 3];
	myFunction.apply(null, args.concat(4));
}