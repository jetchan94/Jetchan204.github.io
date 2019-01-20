function Example44() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	const obj1 = { foo: 'bar', x: 42 };
	const obj2 = { foo: 'baz', y: 5 };

	const clonedObj = { ...obj1 }; // { foo: "bar", x: 42 }
	const mergedObj = { ...obj1, ...obj2 }; // { foo: "baz", x: 42, y: 5 }
	
	console.log(clonedObj);
	console.log(mergedObj);
}