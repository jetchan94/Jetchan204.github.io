function Example49() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	class Rectangle {
		constructor(height, width) {
			this.height = height;
			this.width = width;
	}
  
	get area() {
		return this.calcArea();
	}

	calcArea() {
		return this.height * this.width;
		}
	}

	const square = new Rectangle(5, 5);

	console.log(square.area); // 25
}