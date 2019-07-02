function Example62() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	var value = [4, 5, 1, 8, 2, 0].filter(function (x) {
		return x > 3;
	})[0];
	console.log(value);
}