function Example26() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	let person = {
		name: 'Jack',
		age: 18
	};

	let newPerson = person; //  newPerson references person
	newPerson.name = 'Bob'; 

	console.log(person.name); // Bob
	console.log(newPerson.name); // Bob
}