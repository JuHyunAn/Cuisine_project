window.addEventListener("load", function () {

   var section = document.querySelector("#main");
   var charc = section.querySelector(".charc");
   var editor = section.querySelector(".editor");
   var tbody = document.querySelector(".board tbody");
   
  

   charc.onclick = function(e) {
      
      e.preventDefault();
      var bo = parseInt(e.target.dataset.id);
      asd(bo);
   }
   
   function asd(bo)
         {
   var xhr = new XMLHttpRequest();
   xhr.onload = function() {
      if (xhr.readyState == 4 && xhr.status == 200) {
            var EditorSort = JSON.parse(xhr.responseText);
            var tag = "<tbody>";
            var board = document.querySelector(".board");
            for (var i = 0; i < EditorSort.length; i++) {
               tag += "<tr><td><a href=detail?id="+EditorSort[i].id+">"+EditorSort[i].name+"</a></td>"
//               tag += "<tr><td><a href=detail?id="+EditorSort[i].id+">"+EditorSort[i].address+"</a></td>"
//               tag += "<tr><td><a href=detail?id="+EditorSort[i].id+">"+EditorSort[i].phone+"</a></td>"
//               tag += "<tr><td><a href=detail?id="+EditorSort[i].id+">"+EditorSort[i].openingHours+"</a></td>"
//               tag += "<tr><td><a href=detail?id="+EditorSort[i].id+">"+EditorSort[i].breakingHours+"</a></td>"
               tag += "<td><img style=width:500px;height:500px; src=../../images/restaurants/"+EditorSort[i].pic1+"></td>"
               tag += "</tr>";
            }

            tag += "</tbody>"
               board.innerHTML = tag;


         }
   }

   xhr.open("GET", "/restaurant/reslist?editorId="+bo, true);
   xhr.send();
   
};

 
   

});