function Example19() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	let tree = {
		height: 10,
		color: 'green',
		grow() { 
			this.height += 2;
		}
	};

	tree.grow();
	console.log(tree.height); // 12
}