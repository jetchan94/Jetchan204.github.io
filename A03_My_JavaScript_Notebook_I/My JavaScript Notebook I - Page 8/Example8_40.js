function Example40() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	const myFunction = (w, x, y, z) => {
		console.log(w + x + y + z);
	};
	let args = [1, 2, 3];
	myFunction(...args, 4);
}