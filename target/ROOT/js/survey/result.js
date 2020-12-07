/* 
select 
m.userId as userId,
m.matchRate as matchRate,
e.name as editorName,
e.description as editorDescription,
e.image as editorImage
    from member m left outer join editor e on m.editorId=m.id;
*/
var data1 =`[
    {   
        "userId" : "Sj",
        "editorImage" : "editor.png",
        "editorName"  : "단짠단짠",
        "editorDescription" : "달고짠걸 좋아하는타입설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충",
        "matchRate" :  58
        
    },
    {   
        "memberUserId" : "Sj2",
        "editorImage" : "editor.png",
        "editorName"  : "단짠단짠22",
        "editorDescroption" : "22달고짠걸 좋아하는타입설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충설명충",
        "memberMatchRate" :  22
    }
]`;
var list = JSON.parse(data1);

window.addEventListener("load", function() {
    var body = document.querySelector("#body");
    var resultEditorImage = body.querySelector(".result-editor-image");
    var resultEditorName = body.querySelector(".result-editor-name");
    var resultEditorPercent = body.querySelector(".result-editor-percent");
    var resultEditor = body.querySelector(".result-editor");
    var resultExplainContent = body.querySelector(".result-explain-content");
    var resultExplainTitle = body.querySelector(".result-explain-title");

    resultEditorImage.style.background = `url(/images/editors/${list[1].editorImage}) no-repeat center`;
    resultEditorName.innerText = `${list[1].editorName}`;
    resultEditorPercent.innerText = `매칭률 : ${list[1].memberMatchRate}%`;
    resultExplainContent.innerText = `${list[1].editorDescroption}`;
    resultExplainTitle.innerText = `${list[1].memberUserId}님의 입맛은?`;
    


    


});