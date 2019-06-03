//Askisi 1
function changeColor(){
    var x = document.getElementById("textBox");
    if(isNaN(x.value)){
        x.style.backgroundColor = "green";
    }else if(x.value==""){
        x.style.backgroundColor = "red";
    }else{
        x.style.backgroundColor = "yellow";
    }
}

//Askisi 2
function changeToUpper(){
    var x = document.getElementById("lowerCase");
    var y = document.getElementById("upperCase");
    y.value=x.value.toUpperCase();
}

//Askisi 3
function changeIcon1(){
    var x = document.getElementById("icon");
    x.src = "1.jpg";
}

function changeIcon2(){
    var x = document.getElementById("icon");
    x.src = "2.jpg";
}

function changeIcon3(){
    var x = document.getElementById("icon");
    x.src = "3.jpg";
}

//Askisi 4
function welcomeMessage(){
    alert("Welcome to my website");
}

function byeMessage(){
    alert("Bye-Bye!!");
}

//Askisi 5
function changeYellow(textBox){
    textBox.style.backgroundColor = "yellow";
}

function changeWhite(textBox){
    if(textBox.value){
        textBox.style.backgroundColor = "white";
    }else{
        textBox.style.backgroundColor = "red";
    }
}