function Example35() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	var o = {h: 42, s: true};
	var {h: foo, s: bar} = o;

	//console.log(h); // Error
	console.log(foo); // 42
}