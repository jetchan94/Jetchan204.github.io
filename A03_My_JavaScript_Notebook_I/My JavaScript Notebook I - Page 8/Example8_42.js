function Example42() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	var arr = ["One", "Two", "Five"];

	arr.splice(2, 0, "Three");
	arr.splice(3, 0, "Four");
	console.log(arr);
}