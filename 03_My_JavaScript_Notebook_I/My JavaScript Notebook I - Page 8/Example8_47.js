function Example47() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	var Square = class Rectangle {
		constructor(height, width) {
			this.height = height;
			this.width = width;
		}
	};

	const square = new Square(5, 5);
	const poster = new Square(2, 3); 

	console.log(square.height);
}