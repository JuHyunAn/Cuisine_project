/**
 * 
 */
window.addEventListener("load", function() {
	var section = document.querySelector("#s1");
	var input = section.querySelector(".input");
	var test = section.querySelector(".test");

	input.onclick = function() {
		var xhr = new XMLHttpRequest();
		xhr.open('GET', 'http://localhost/cuisine/restaurant/list', false)
		xhr.onload = function() {
			var result = JSON.parse(xhr.responseText);
			console.log(result);
		};
		xhr.send();
		
	}
});
