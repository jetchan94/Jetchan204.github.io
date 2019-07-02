function Example67() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	console.log("SoloLearn".indexOf("Solo") === 0); // true
	console.log("SoloLearn".indexOf("Solo") === (4 - "Solo".length)); // true
	console.log("SoloLearn".indexOf("loLe") !== -1); // true
	console.log("SoloLearn".indexOf("olo", 1) !== -1); // true
	console.log("SoloLearn".indexOf("olo", 2) !== -1); // false
}