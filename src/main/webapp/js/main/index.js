
window.addEventListener("load", function () {
   
   var randList = new Array();
    var random = parseInt(Math.random() *139+3);
       randList.push(random);
    while (randList.length <= 2) {
       random = parseInt(Math.random() * 139+3);
    while (randList.indexOf(random) != -1) {   
       random = parseInt(Math.random() * 139+3);  
    }  
    randList.push(random);   
    }
    var section =document.querySelector("#main");
    var btn =section.querySelector(".next-button");  
    var randomId=[];
    var a=0;
    var randomRes=randList[a];
    
    first();
    function first(){
    var xhr = new XMLHttpRequest();
     xhr.onload =function(){

         var mainImage = JSON.parse(xhr.responseText);
         var tag = "<tbody>";
         var board = document.querySelector(".board");
         for (var i = 0; i < mainImage.length; i++) {
            tag += "<tr><td><img style=width:1000px;height:500px; src=../../images/restaurants/"+mainImage[i].pic1+"></td>"
            tag += "</tr>";
            tag += "<div>"+mainImage[i].name+"</div>";
         }

         tag += "</tbody>"
            board.innerHTML = tag;
//         console.log(randomRes);
        
   }
   xhr.open("GET", "/restaurant/images?id="+randomRes, true);
   xhr.send();

   }
        

        
       btn.onclick=function(e){
       e.preventDefault();                                           
       a++;
       a = a%3;    
       randomRes=randList[a];          
//       console.log(randomRes);
       next(randomRes);
//                
      };
   function next(randomRes){
               var xhr = new XMLHttpRequest();
               xhr.onload =function(){
                   var mainImage = JSON.parse(xhr.responseText);
                     var tag = "<tbody>";
                     var board = document.querySelector(".board");
                     for (var i = 0; i < mainImage.length; i++) {
                        tag += "<tr><td><img style=width:1000px;height:500px; src=../../images/restaurants/"+mainImage[i].pic1+"></td>"
                        tag += "</tr>";
                        tag += "<div>"+mainImage[i].name+"</div>";
                     }

                     tag += "</tbody>"
                        board.innerHTML = tag;
//                     console.log(randomRes);
               }
               xhr.open("GET", "/restaurant/images?id="+randomRes, true);
               xhr.send();
            };
               
});