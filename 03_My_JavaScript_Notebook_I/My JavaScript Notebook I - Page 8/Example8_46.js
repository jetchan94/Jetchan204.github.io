function Example46() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	class Rectangle {
		constructor(height, width) {
			this.height = height;
			this.width = width;
		}
	}

	const square = new Rectangle(5, 5);
	const poster = new Rectangle(2, 3); 

	console.log(square.height);
}