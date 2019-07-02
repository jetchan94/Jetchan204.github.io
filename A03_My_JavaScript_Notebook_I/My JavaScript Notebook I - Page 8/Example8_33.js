function Example33() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	let a, b;
	({a, b} = {a: 'Hello ', b: 'Jack'});

	console.log(a + b);
}