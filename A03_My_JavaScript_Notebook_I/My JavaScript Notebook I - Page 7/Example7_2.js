function Example2() {
	var myWindow = window.open('', '', 'width=400, height=200')

		//calling the function in window.onload to make sure the HTML is loaded
	window.onload = function() {
    var el = document.getElementsByTagName('a');
    el[0].href= 'http://www.sololearn.com';
	};

	//myWindow.document.write(t);	
}
