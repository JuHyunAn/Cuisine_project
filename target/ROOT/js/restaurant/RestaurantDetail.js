window.onload = function() {
			var id =1;
			var xhr = new XMLHttpRequest();
			xhr.onload = function() {
				if (xhr.readyState == 4 && xhr.status == 200) {
					var EditorSort = JSON.parse(xhr.responseText);
					var tag = "<tbody>";
					var Editor = document.querySelector(".editor-table");
					for (var i = 0; i < EditorSort.length; i++) {
						tag += "<tr><td><button class='show-review"+[i+1]+"'><img src=images/editor/"+EditorSort[i].editorImage+">"
								"</button></td>"
						tag += "<td>" + EditorSort[i].editorName + "</td>"
						tag += "<td>" + EditorSort[i].editorDescription + "</td>"
						tag += "<td>" + EditorSort[i].averageScore + "</td>"
						tag += "<td>" + EditorSort[i].commentCount + "</td>"
						tag += "</tr>";
					}

					tag += "</tbody>"
					Editor.innerHTML = tag;

					var showReview1 = document.querySelector(".show-review1");
					var showReview2 = document.querySelector(".show-review2");
					/*var showReview3 = document.querySelector(".show-review3");
					var showReview4 = document.querySelector(".show-review4");
					var showReview5 = document.querySelector(".show-review5");
					var showReview6 = document.querySelector(".show-review6");*/
					
					var dnone = document.querySelector(".d-none");
					showReview1.onclick = function() {
						dnone.style.display = "flex";
					};
					showReview2.onclick = function() {
						dnone.style.display = "flex";
					};
					/*showReview3.onclick = function() {
						dnone.style.display = "flex";
					};
					showReview4.onclick = function() {
						dnone.style.display = "flex";
					};
					showReview5.onclick = function() {
						dnone.style.display = "flex";
					};
					showReview6.onclick = function() {
						dnone.style.display = "flex";
					};*/
					
					var hideReview = document.querySelector(".hide-review");
					hideReview.onclick = function() {
						dnone.style.display = "none";
					};
					

				}
			}
			xhr.open("GET", "/restaurant/commemt/statistic?restaurantId="+id, true);
			xhr.send();

			var xhr2 = new XMLHttpRequest();
			xhr2.onload = function() {
				if (xhr2.readyState == 4 && xhr2.status == 200) {
					var restaurant = JSON.parse(xhr2.responseText);

					var ul = "<ul>";
					var ul2 = "<ul>";
					var ResDetail = document.querySelector(".restaurant-detail");
					for (var i = 0; i < restaurant.length; i++) {
						ul += "<li>"+ "상호" + ":" + restaurant[i].name + "</li>"
						ul += "<li>"+ "주소" + ":" + restaurant[i].address + "</li>"
						ul += "<li>"+ "전화번호" + ":" + restaurant[i].phone + "</li>"
						ul += "<li>"+ "영업시간" + ":" + restaurant[i].openingHours + "</li>"
						ul += "<li>"+ "브레이크 타임" + ":" + restaurant[i].breakingHours + "</li>"
						ul2 += "<li>"+ "홀 청결도" + ":" + restaurant[i].hallcleanness + "</li>"
						ul2 += "<li>"+ "화장실 청결도" + ":" + restaurant[i].toiletcleanness + "</li>"
						ul2 += "<li>"+ "주차장 여부" + ":" + restaurant[i].parkinglot + "</li>"
						ul2 += "<li>"+ "평점" + restaurant[i].avg + "</li>"
					}

					ul += "</ul>"
					ul2 += "</ul>"
					ResDetail.innerHTML = ul+ul2;
				}
			}
			xhr2.open("GET", "/restaurant/detail?id="+id, true);
			xhr2.send();
 
			 var xhr3 = new XMLHttpRequest();
			xhr3.onload = function()
			{
			    if(xhr3.readyState == 4 && xhr3.status == 200)
			    {
			     var image = JSON.parse(xhr3.responseText);    
			     var img1 = "";
			     var Editorrr = document.querySelector(".image_position");
			     for(var i=0; i<image.length; i++)
			     {
	
			    img1 += "<img src = images/food/"+image[i].image+">"
			    
			    }
			     
			     img1 += ""
			     Editorrr.innerHTML = img1;
			   }
			}
			xhr3.open("GET", "/restaurant/image?id="+id, true);
			xhr3.send();
			
			/*var xhr4 = new XMLHttpRequest();
			xhr4.onload = function()
			{
			    if(xhr4.readyState == 4 && xhr4.status == 200)
			    {
			     var comment = JSON.parse(xhr4.responseText);    
			     var tbody = "<tbody>";
			     var membercomment = document.querySelector(".member-comment");
			     for(var i=0; i<comment.length; i++)
			     {
	
			    	 tbody += "<tr><td>"+comment[i].userId+"</td><td>"+comment[i].content+"</td><td>"+comment[i].score+"</td></tr>"
			    }
			     
			     tbody += "</tbody>"
			   	 membercomment.innerHTML = tbody;
			   }
			}
			xhr4.open("GET", "/restaurant/comment/list?id=1", true);
			xhr4.send();*/
		};