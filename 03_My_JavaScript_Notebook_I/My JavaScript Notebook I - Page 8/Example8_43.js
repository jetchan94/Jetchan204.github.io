function Example43() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	let newArr = ['Three', 'Four']; 
	let arr = ['One', 'Two', ...newArr, 'Five'];
	console.log(arr);
}