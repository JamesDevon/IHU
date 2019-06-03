//Askisi 1
var index = 1;
var pics = [['bookimg/p1.jpg','bookimg/p2.jpg','bookimg/p3.jpg','bookimg/p4.jpg','bookimg/p5.jpg','bookimg/p6.jpg','bookimg/p7.jpg','bookimg/p8.jpg','bookimg/p9.jpg','bookimg/p10.jpg','bookimg/p11.jpg','bookimg/p12.jpg','bookimg/p13.jpg','bookimg/p14.jpg','bookimg/p15.jpg']
            ,['200','300','400','200','300','400','200','300','400','200','300','400','200','300','400',],['200','300','400','200','300','400','200','300','400','200','300','400','200','300','400',]];

function nextImg(){
    var img = document.getElementById("img");
    if(index==14){
        index=0;
    }else{
        index++;
    }
    img.src = pics[0][index];
}

function previousImg(){
    var img = document.getElementById("img");
    if(index==0){
        index=14
    }else{
        var img = document.getElementById("img");
        index--;
    }
    img.src = pics[0][index];
}

//Askisi 2
function nextImgSize(){
    var img = document.getElementById("img");
    if(index==14){
        index=0;
    }else{
        index++;
    }
    img.src = pics[0][index];
    img.width = pics[1][index]
    img.height = pics[2][index]
}

function previousImgSize(){
    var img = document.getElementById("img");
    if(index==0){
        index=14
    }else{
        var img = document.getElementById("img");
        index--;
    }
    img.src = pics[0][index];
    img.width = pics[1][index]
    img.height = pics[2][index]
}

//Askisi 3
var flag = false;
function showImgUrl(){
    var button = document.getElementById('b');
    var console = document.getElementById("console");
    if(flag){
        console.innerHTML ="";
        button.value="Show Url";
        flag=false;
    }else{
        console.innerHTML =pics[0][index];
        button.value="Hide Url";
        flag=true;
    }
}

//Askisi 4
function addToBox(){
    var text = document.getElementById("textBox");
    if(text.value==""){
        alert("You can't add an empty text!");
    }else{
        var box = document.getElementById("box");
        var c = document.createElement("option");
        c.text=text.value;
        box.options.add(c);
    }
}

//Askisi 6
function fillTable(){
    var randomNum;
    var table = document.getElementById("table");
    for(var i=0; i<table.rows.length; i++){
        for(var j=0; j<table.rows[i].cells.length; j++){
            randomNum = Math.ceil(Math.random()*10);
            if(randomNum>=5){
                table.rows[i].cells[j].style.backgroundColor = "green";
            }else{
                table.rows[i].cells[j].style.backgroundColor = "red";
            }
            table.rows[i].cells[j].innerHTML = randomNum;
        }
    }
}

//Askisi 7
var dict = new Object();
var dict = {};
dict = {"H1" : false ,"H2" : false };
function changeHeaders(){
    var button = document.getElementById("b");
    var box = document.getElementById("box");
    var header = document.getElementsByTagName(box.options[box.selectedIndex].value);
    if(dict[header[0].tagName]==false){
        header[0].style.backgroundColor = "yellow";
        dict[header[0].tagName]=true;
        button.value = "Uncolour";
    }else{
        header[0].style.backgroundColor = "white";
        dict[header[0].tagName]=false;
        button.value = "Colour";
    }
}