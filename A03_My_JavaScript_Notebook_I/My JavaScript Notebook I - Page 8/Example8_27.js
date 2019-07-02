function Example27() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	let person = {
		name: 'Jack',
		age: 18
	};

	let newPerson = Object.assign({}, person); //  newPerson references person
	newPerson.name = 'Bob'; 

	console.log(person.name); // Jack
	console.log(newPerson.name); // Bob
}