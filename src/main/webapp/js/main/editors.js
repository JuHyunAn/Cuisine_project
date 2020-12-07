window.addEventListener("load", function(){
    var section = document.querySelector("#main");
    var container = section.querySelector(".container")
    var box = container.querySelector(".box");
    var desc = container.querySelector(".description");
    var imgDiv = desc.querySelector("div");
    
    var editorDesc = [
        {id:1, title:"역시 음식은 단짠", detail:"역시 음식은 달고 짠 것이 맛있죠! <br>미감동행에 당신과 같은 입맛을 가진 <br>회원들이 정말 많을 것 같아요! <br>하지만 건강을 생각해서 <br>조금은 싱겁게 드셔보세요~"},
        {id:2, title:"중독의 매운맛", detail:"스트레스 해소에는 매운 음식! <br>당신을 위한 매운 음식은 <br>한식에 많이 있을 것 같아요~ <br>미감동행에서 다른 회원들의 평가를 통해, 매운 음식과 <br>그 정도를 확인해보세요!"},
        {id:3, title:"건강을 생각하면 싱겁게", detail:"건강을 생각하는 당신! <br>평소 싱거운 음식점을 찾는다는 건 <br>쉬운 일이 아니죠.. <br>하지만 미감동행과 함께라면, <br>당신과 같은 입맛을 가진 회원들의 진솔한 의견을 보고 찾을 수 있답니다!"},
        {id:4, title:"어떤 음식을 선택해도 ok", detail:"당신의 입에 안 맞는 것은 뭐죠..? <br>모든 것을 다 좋아하는 당신! <br>미감동행과 함께, 앞으로 싫어하는 <br>음식만 피하시면 될 것 같네요~"},
        {id:5, title:"초딩 입맛은 분식이지", detail:"초딩 입맛 당신! <br>사실 이런 분들이 아주 많답니다! <br>미감동행과 함께 어린시절을 <br>공유해봐요~ <br>마음에 드는 음식점이 있을꺼에요!"}
    ];
    
    //첫번째 사진 클릭하면 나오는 내용
    box.onclick = function(e){
        e.preventDefault();
        imgDiv.innerHTML = "";        

        // img의 data-id값을 마우스로 클릭(e.target)하여 dataset.id로 받아서 숫자로 변환한다.
        var i = parseInt(e.target.dataset.id);
        console.log(e.target.dataset.id); 
        console.log(typeof i); 
        
        var div = desc.querySelector("div");
        var h1Tag = document.createElement("h1");
        var titleContent = `${editorDesc[i-1].title}`;
        h1Tag.innerHTML = titleContent;
        div.appendChild(h1Tag);

        var pTag = document.createElement("p");
        var detailContent = `${editorDesc[i-1].detail}`;
        pTag.innerHTML = detailContent;
        div.appendChild(pTag);

        console.log(e.target);

    }
        
});