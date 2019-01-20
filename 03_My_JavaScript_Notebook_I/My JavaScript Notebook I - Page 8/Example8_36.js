function Example36() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	var obj = {id: 42, name: "Jack"};

	let {id = 10, age = 20} = obj;

	console.log(id); // 42
	console.log(age); // 20
}