/**
 * 
 */
window.addEventListener("load",function(){
    var LoginForm = document.querySelector("#login");
    var SignForm = document.querySelector("#signup");

    var signUpBtn = LoginForm.querySelector(".signUpBtn")
    var loginBtn = LoginForm.querySelector(".loginBtn")


    signUpBtn.onclick = function(){
        LoginForm.classList.add("d-none");
        SignForm.classList.remove("d-none");
    }
});