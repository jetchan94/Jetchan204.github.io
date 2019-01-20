function Example7() {
	var myWindow = window.open("", "", "width=400, height=200")
	var person = []; //empty array
	person["name"] = "John";
	person["age"] = 46;
	//document.write(person["age"]);
	//Outputs "46"
	
	myWindow.document.write(person["age"]); 
}