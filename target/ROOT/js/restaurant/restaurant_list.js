window.addEventListener("load", function () {

    var aaaa = document.querySelector(".charac");
    var editor1 = aaaa.querySelector(".editor1");
    var editor2 = aaaa.querySelector(".editor2");
    var editor3 = aaaa.querySelector(".editor3");
    var editor4 = aaaa.querySelector(".editor4");
    var editor5 = aaaa.querySelector(".editor5");
    var editor6 = aaaa.querySelector(".editor6");

    var tbody = document.querySelector(".board tbody");
  

   

    editor1.onclick = function () {
        tbody.innerHTML = "";
        var rlist = JSON.parse(c1R);
        for (var i in rlist) {
            var tr = document.createElement("tr");
    
            
            tr.innerHTML = `<td><a href="detail?=${rlist[i].id}">${rlist[i].name}</a></td>                   
                        <td><img src="images/food/${rlist[i].image}" style="width:200px; height:200px;"> </td>`;
            tbody.appendChild(tr);
        }
    }
    editor2.onclick = function () {
        tbody.innerHTML = "";
        var rlist = JSON.parse(c2R);
        for (var i in rlist) {
            var tr = document.createElement("tr");
    
           
            tr.innerHTML = `<td><a href="detail?=${rlist[i].id}">${rlist[i].name}</a></td>                    
                        <td><img src="images/food/${rlist[i].image}" style="width:200px; height:200px;"> </td>`;
            tbody.appendChild(tr);
        }
    }
    editor3.onclick = function () {
        tbody.innerHTML = "";
        var rlist = JSON.parse(c3R);
        for (var i in rlist) {
            var tr = document.createElement("tr");
    
 
            tr.innerHTML = `<td><a href="detail?=${rlist[i].id}">${rlist[i].name}</a></td>                    
                        <td><img src="images/food/${rlist[i].image}" style="width:200px; height:200px;"> </td>`;
            tbody.appendChild(tr);
        }
    }
    editor4.onclick = function () {
        tbody.innerHTML = "";
        var rlist = JSON.parse(c4R);
        for (var i in rlist) {
            var tr = document.createElement("tr");
    
           
            tr.innerHTML =`<td><a href="detail?=${rlist[i].id}">${rlist[i].name}</a></td>                    
                        <td><img src="images/food/${rlist[i].image}" style="width:200px; height:200px;"> </td>`;
            tbody.appendChild(tr);
        }
    }
    editor5.onclick = function () {
        tbody.innerHTML = "";
        var rlist = JSON.parse(c5R);
        for (var i in rlist) {
            var tr = document.createElement("tr");
    
            
            tr.innerHTML =`<td><a href="detail?=${rlist[i].id}">${rlist[i].name}</a></td>                    
                        <td><img src="images/food/${rlist[i].image}" style="width:200px; height:200px;"> </td>`;
            tbody.appendChild(tr);
        }
    }
    editor6.onclick = function () {
        tbody.innerHTML = "";
        var rlist = JSON.parse(c6R);
        for (var i in rlist) {
            var tr = document.createElement("tr");
    
         
            tr.innerHTML =`<td><a href="detail?=${rlist[i].id}">${rlist[i].name}</a></td>                    
                        <td><img src="images/food/${rlist[i].image}" style="width:200px; height:200px;"> </td>`;
            tbody.appendChild(tr);
        }
    }


    var c1R = `[
    {
      
      "id":1,  
      "name": "김밥천국",
      "image": "김밥천국.png"
      
    },
    {
        "id":2,   
        "name": "맥도날드",
        "image": "맥도날드.png"
    },
    {
        "id":3,
        "name": "바비레드",
        "image": "바비레드.png"
    },
    {   "id":4,
        "name": "종로 불돼지",
        "image": "종로불돼지.png"
    },
    {   "id":5,
        "name": "평양고깃집",
        "image": "평양고깃집.png"
    },
    {
        "id":6,
        "name": "델리커리",
        "image": "델리커리.png"
    }
  ]`;
    var c2R = `[
    {
      "id":7,
      "name": "쟁반집8292",
      "image": "쟁반집8292.png"
      
    },
    {
        "id":8,
        "name": "빌즈",
        "image": "빌즈.png"
    },
    {
        "id":9,
        "name": "포브라더스",
        "image": "포브라더스.png"
    },
    {
        "id":10,
        "name": "후니도니",
        "image": "후니도니.png"
    },
    {
        "id":11,
        "name": "스시소라",
        "image": "스시소라.png"
    },
    {
        "id":12,
        "name": "하동관",
        "image": "하동관.png"
    }
  ]`;
  var c3R = `[
    {
      "id":13,
      "name": "디라이프스타일키친",
      "image": "디라이프스타일키친.png"
      
    },
    {
        "id":14,
        "name": "미진",
        "image": "미진.png"
    },
    {
        "id":15,
        "name": "차알",
        "image": "차알.png"
    },
    {
        "id":16,
        "name": "롯데리아",
        "image": "롯데리아.png"
    },
    {
        "id":17,
        "name": "서브웨이",
        "image": "서브웨이.png"
    },
    {
        "id":18,
        "name": "할매순대국",
        "image": "할매순대국.png"
    }
  ]`;
  var c4R = `[
    {
      "id":19,
      "name": "미도인",
      "image": "미도인.png"
      
    },
    {
        "id":20,
        "name": "포비",
        "image": "포비.png"
    },
    {
        "id":21,
        "name": "적당",
        "image": "적당.png"
    },
    {
        "id":22,
        "name": "남포면옥",
        "image": "남포면옥.png"
    },
    {
        "id":23,
        "name": "남도미가",
        "image": "남도미가.png"
    },
    {
        "id":24,
        "name": "이나니와요시케",
        "image": "이나니와요시케.png"
    }
  ]`;
  var c5R = `[
    {
      "id":25,
      "name": "라세느",
      "image": "라세느.png"
      
    },
    {
        "id":26,
        "name": "서울상회",
        "image": "서울상회.png"
    },
    {
        "id":27,
        "name": "고잉메리",
        "image": "고잉메리.png"
    },
    {
        "id":28,
        "name": "바캉스커피",
        "image": "바캉스커피.png"
    },
    {
        "id":29,
        "name": "무교동북어국",
        "image": "무교동북어국.png"
    },
    {
        "id":30,
        "name": "무교동낙지",
        "image": "무교동낙지.png"
    }
  ]`;
  var c6R = `[
    {
      "id":31,
      "name": "바스버거",
      "image": "바스버거.png"
      
    },
    {
        "id":32,
        "name": "kfc",
        "image": "kfc.png"
    },
    {
        "id":33,
        "name": "봉구스",
        "image": "봉구스.png"
    },
    {
        "id":34,
        "name": "노랑통닭",
        "image": "노랑통닭.png"
    },
    {
        "id":35,
        "name": "홍콩반점",
        "image": "홍콩반점.png"
    },
    {
        "id":36,
        "name": "역전우동",
        "image": "역전우동.png"
    }
  ]`;


   
   
}); 