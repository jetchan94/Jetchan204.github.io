function Example28() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	let person = {
		name: 'Jack',
		age: 18
	};

	let newPerson = Object.assign({}, person, {name: 'Bob'});

	console.log(newPerson.name); // Bob
}