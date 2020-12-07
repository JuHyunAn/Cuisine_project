var randList = new Array();

      var random = parseInt(Math.random() *6);

      randList.push(random);

      while (randList.length <= 2) {
      
      random = parseInt(Math.random() * 6);

      while (randList.indexOf(random) != -1) {
      
      random = parseInt(Math.random() * 6);
      
      }
      
      randList.push(random);
      
   
      
      }
window.addEventListener("load", function () {
    var section =document.querySelector("#main");
    var btn =section.querySelector(".next-button");
    var tbody = document.querySelector(".board tbody");
    var randomId=[];

    var rname = `[
        {
          "id":1,
          "image": "김밥천국.png"
          
        },
        {
            "id":2,
            "image": "맥도날드.png"
        },
        {
            "id":3,
            "image": "바비레드.png"
        },
        {   
            "id":4,
            "image": "종로불돼지.png"
        },
        {   
            "id":5,
            "image": "평양고깃집.png"
        },
        {
            "id":6,
            "image": "델리커리.png"
        }
      ]`;
      
         console.log(randList);
       
        
        var a=0;
        var randomRes=randList[a];
        var tbody = document.querySelector(".board tbody");

        

       

        
 
    
    
    var rfood = JSON.parse(rname);
        var tr = document.createElement("tr");
        
     

        tr.innerHTML = `<td><img src="/images/${rfood[randomRes].image}"style="width:1000px; height:500px;"> </td>`;
        tbody.appendChild(tr);
        
        
            
             
            
            btn.onclick=function(e){
                e.preventDefault();
              
                
                tbody.innerHTML = "";
                var rfood = JSON.parse(rname);
                var tr = document.createElement("tr");
                a++;
                a = a%3;    
               randomRes=randList[a];
                tr.innerHTML = `<td><img src="/images/${rfood[randomRes].image}"style="width:1000px; height:500px;"> </td>`;
                tbody.appendChild(tr);
                // alert(randomRes);
                
    
            };
            
             
            
         
            
            
});