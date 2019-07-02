function Example52() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	class Animal {
		constructor(name) {
			this.name = name;
		}
	speak() {
		console.log(this.name + ' makes a noise.');
		}
	}

	class Dog extends Animal {
		speak() {
			super.speak(); // Super
			console.log(this.name + ' barks.');
		}
	}

	let dog = new Dog('Rex');
	dog.speak();
	// Rex makes a noise.
	// Rex barks.
}