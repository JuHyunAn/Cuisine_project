var i = 0;

var data = `[
                {
                    "id":0,
                    "option1":"곱창쏘맥",
                    "option1Image":"1-1.png",
                    "option2":"곱창쏘주",
                    "option2Image":"1-2.png"
                },
                {
                    "id":1,
                    "option1":"김밥라면",
                    "option1Image":"2-1.png",
                    "option2":"김밥쫄면",
                    "option2Image":"2-2.png"
                },
                {
                    "id":2,
                    "option1":"김치볶음밥계란",
                    "option1Image":"3-1.png",
                    "option2":"김치볶음밥치즈",
                    "option2Image":"3-2.png"
                }
                ,
                {
                    "id":3,
                    "option1":"떡볶이순대",
                    "option1Image":"4-1.png",
                    "option2":"떡볶이튀김",
                    "option2Image":"4-2.png"
                }
                ,
                {
                    "id":4,
                    "option1":"막걸리두부김치",
                    "option1Image":"5-1.png",
                    "option2":"막걸리파전",
                    "option2Image":"5-2.png"
                }
                ,
                {
                    "id":5,
                    "option1":"매운음식우유",
                    "option1Image":"6-1.png",
                    "option2":"매운음식쿨피스",
                    "option2Image":"6-2.png"
                }
                ,
                {
                    "id":6,
                    "option1":"부대찌개라면사리",
                    "option1Image":"7-1.png",
                    "option2":"부대찌개우동사리",
                    "option2Image":"7-2.png"
                }
                ,
                {
                    "id":7,
                    "option1":"비빔밥간장",
                    "option1Image":"8-1.png",
                    "option2":"비빔밥고추장",
                    "option2Image":"8-2.png"
                }
                ,
                {
                    "id":8,
                    "option1":"소시지머스타드",
                    "option1Image":"9-1.png",
                    "option2":"소시지케첩",
                    "option2Image":"9-2.png"
                }
                ,
                {
                    "id":9,
                    "option1":"오므라이스데미그라스",
                    "option1Image":"10-1.png",
                    "option2":"오므라이스케첩",
                    "option2Image":"10-2.png"
                },
                {
                    "id":10,
                    "option1":"치맥",
                    "option1Image":"11-1.png",
                    "option2":"치쏘",
                    "option2Image":"11-2.png"
                }
                ,
                {
                    "id":11,
                    "option1":"콩국수설탕",
                    "option1Image":"12-1.png",
                    "option2":"콩국수소금",
                    "option2Image":"12-2.png"
                }
                ,
                {
                    "id":12,
                    "option1":"탕수육짜장면",
                    "option1Image":"13-1.png",
                    "option2":"탕수육짬뽕",
                    "option2Image":"13-2.png"
                }
                ,
                {
                    "id":13,
                    "option1":"회간장",
                    "option1Image":"14-1.png",
                    "option2":"회초고추장",
                    "option2Image":"14-2.png"
                }
                ,
                {
                    "id":14,
                    "option1":"마지막ㅇ",
                    "option1Image":"1-1.png",
                    "option2":"마지막ㅇ2",
                    "option2Image":"1-2.png"
                }

            ]`;
var answers = [];
var list = JSON.parse(data);

window.addEventListener("load", function () {
    var body = document.querySelector("#body");
    var option1 = body.querySelector("#option1");
    var option2 = body.querySelector("#option2");
    var option11 = body.querySelector("#option11");
    var option22 = body.querySelector("#option22");
    var testId = body.querySelector("#testId");
    option1.onclick = function (e) { onOptionSelected(1); }
    option2.onclick = function (e) { onOptionSelected(2); }
    showOptions();
});

// function showOptions() {
// option1.innerText = "asdfasdf";
// option1.style.background = `url(images/${step}-1.jpeg) no-repeat center`;
// option2.innerText = "asdfasdf";
// option2.style.background = `url(images/${step}-2.jpeg) no-repeat center`;
// step += 1;
// console.log(option1.style.background);
// }
function showOptions() {

    if (i == 15){
        alert("완료되었습니다");
        // location.replace("result.html");
    }
    if (i < 15) {
        testId.innerText = `${list[i].id}`;
        // console.log(option1.innerText);
        option11.innerText = `${list[i].option1}`;
        // console.log(option1.innerText);
        option1.style.background = `url(../images/survey/${list[i].option1Image}) no-repeat center`;
        // console.log(option1.style.background);

        option22.innerText = `${list[i].option2}`;
        option2.style.background = `url(../images/survey/${list[i].option2Image}) no-repeat center`;
    }
}

function onOptionSelected(answer) {
    if (i < 15) {
        answers[i] = answer;
        console.log(answer);
        console.log(i);
        i++;
        showOptions();
        if(i==15)
        location.replace("../survey/result");
    }
    
}