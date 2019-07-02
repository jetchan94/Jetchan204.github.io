function Example30() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	let a = () => {
		return [1, 3, 2];
	};

	let [one, , two] = a();

	console.log(one); // 1
	console.log(two); // 2
}