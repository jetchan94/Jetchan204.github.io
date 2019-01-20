function Example45() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	const obj1 = { foo: 'bar', x: 42 };
	const obj2 = { foo: 'baz', y: 5 };
	const merge = (...objects) => ({ ...objects });

	let mergedObj = merge (obj1, obj2);
	// { 0: { foo: 'bar', x: 42 }, 1: { foo: 'baz', y: 5 } }

	let mergedObj2 = merge ({}, obj1, obj2);
	// { 0: {}, 1: { foo: 'bar', x: 42 }, 2: { foo: 'baz', y: 5 } }
	
	console.log(mergedObj);
	console.log(mergedObj2);
}