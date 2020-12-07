window.addEventListener("load", function(){
    var section = document.querySelector("#main");
    var container = section.querySelector(".container")
    var box = container.querySelector(".box");
    var desc = container.querySelector(".description");
    var imgDiv = desc.querySelector("div");
    
    var editorDesc = [
        {id:1, title:"역시 음식은 단짠", detail:"역시 음식은 달고 짠 것이 맛있죠! 미감동행에 당신과 같은 입맛을 가진 회원들이 정말 많을 것 같아요! 하지만 건강을 생각해서 조금은 싱겁게 드셔보세요~"},
        {id:2, title:"매운게 좋지", detail:"스트레스 해소는 매운 음식!당신을 위한 매운 음식은 한식에 많이 있을 것 같아요~ 미감동행에서 다른 회원들의 평가를 통해서 매운맛의 정도를 확인해봐요!."},
        {id:3, title:"건강을 위해 싱겁게", detail:"건강을 생각하는 당신! 싱거운 음식점을 찾는 것은 사실 많이 까다롭답니다~하지만 미감동행과 함께라면 당신과 같은 입맛을 가진 회원들의 진솔한 의견을 보고 찾을 수 있답니다."},
        {id:4, title:"가리지 않는 아저씨", detail:"당신의 입에 안 맞는 것은 뭐죠? 모든 것을 다 좋아하는 당신! 미감동행과 함께 싫어하는 음식만 피하시면 될 것 같아요"},
        {id:5, title:"초딩입맛은 분식이지", detail:"초딩입맛 당신… 사실 이런 분들이 아주 많답니다!당신에게 딱 어울리는 음식점을 미감동행에서 함께 찾아봐요!"}
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