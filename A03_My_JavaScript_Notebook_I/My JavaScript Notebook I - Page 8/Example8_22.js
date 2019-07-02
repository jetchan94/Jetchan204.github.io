function Example22() {
//	var myWindow = window.open("", "", "width=400, height=200");
	
	let prop = 'name';
	let id = '1234';
	let mobile = '08923';

	let user = {
		[prop]: 'Jack',
		[`user_${id}`]: `${mobile}`
	};

	console.log(user.name); // Jack
	console.log(user.user_1234); // 08923
}