/**
 * 
 */
window.addEventListener("load",function(){

    var section = document.querySelector("#s1")
    var regCom = section.querySelector(".regcom")
    

    regCom.onclick = function(e){
        e.preventDefault();
        alert("클릭했음")
    }
});