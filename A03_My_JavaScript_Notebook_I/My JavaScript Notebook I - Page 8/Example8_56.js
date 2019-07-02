function Example56() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	let set = new Set();
	set.add(5).add(9).add(59).add(9);

	console.log(set.has(9));

	for (let v of set.values())
		console.log(v);
}