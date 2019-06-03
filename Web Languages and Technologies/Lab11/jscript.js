var random;
var correct=0;
var wrong=0;
var correctNumbers = 0;
var t = 30;
var int;

function startGame(){
    correct=0;
    wrong=0;
    correctNumbers = 0;
    t = 30;

    var label = document.getElementById("ranNum");
    random =Math.ceil(Math.random()*7+2);
    label.innerHTML = random;
    var table = document.getElementById('table');
    var randomNum;
    for(var i=0; i<table.rows.length; i++){
        for(var j=0; j<table.rows[i].cells.length; j++){
            randomNum = Math.ceil(Math.random()*100);
            if(randomNum%random==0){
                correctNumbers++;
            }
            table.rows[i].cells[j].innerHTML = randomNum;
        }
    }
    var cells = document.getElementsByTagName("td");
    for(var i =0; i<cells.length; i++){
        cells[i].setAttribute('onclick' , 'mult()');
    }
    var int = setInterval(timer,1000);
    setTimeout(score,30000)
}

function timer(){
    t--;
    var timer = document.getElementById("timer");
    timer.innerHTML = t;
}

function mult(){
    var number = event.target.innerHTML;
    if(number%random==0){
        correct++;
        event.target.style.backgroundColor = "green";
    }else{
        wrong++;
        event.target.style.backgroundColor = "red";
    }
}

function score(){
    clearInterval(int);
    var score = (correct/correctNumbers)-(wrong/(25-correctNumbers));
    alert("Your Score is : "+score);
}
//Askisi 2

var index = 0;
var interval;
var imgIndex=0;

function addRow(){
    var table = document.getElementById("table");
    var text = document.createElement("INPUT");
    text.setAttribute("type", "text");
    var button = document.createElement("INPUT");
    button.setAttribute("type", "button");
    button.setAttribute("value", "Load");
    button.setAttribute("onclick", "loadImg(this)");
    var img = document.createElement("img");
    img.setAttribute("alt", ":)");
    img.setAttribute("width", "200");
    img.setAttribute("height", "200");
    table.insertRow(index);
    table.rows[index].insertCell(0);
    table.rows[index].insertCell(1);
    table.rows[index].insertCell(2);
    table.rows[index].cells[0].appendChild(text);
    table.rows[index].cells[1].appendChild(button);
    table.rows[index].cells[2].appendChild(img);
    index++;
}

function loadImg(evt){
    var cell = evt.parentNode;
    var rows = cell.parentNode;
    var cells = rows.getElementsByTagName("td");
    var text = cells[0].childNodes[0].value;
    var img = cells[2].childNodes;
    img[0].src = text;
}


function forward(images){
    if(imgIndex==images.length){
        imgIndex=0;
    }
    var pic = document.getElementById("screen");
    pic.src=images[imgIndex];
    imgIndex++;
}

function startSlideShow(){
    var imgs = [];
    var table = document.getElementById("table");
    for(var i=0; i<table.rows.length; i++){
        imgs.push(table.rows[i].cells[0].childNodes[0].value);
    }
    interval = setInterval(forward(imgs), 1000);
}

function stopSlideShow(){
    clearInterval(interval);
}

//Askisi 3
var clicks = 0;
var fullNum=0;
function startGame2(){
    var button = document.getElementById("button");
    button.disabled = true;
    var table = document.getElementById('table');
    var randomNum;
    var randomColour;
    for(var i=0; i<table.rows.length; i++){
        for(var j=0; j<table.rows[i].cells.length; j++){
            randomNum = Math.floor(Math.random()*10);
            table.rows[i].cells[j].innerHTML = randomNum;
            table.rows[i].cells[j].setAttribute('onclick','tdF()');
            randomColour = Math.random();
            if(randomColour>0.5){
                table.rows[i].cells[j].style.backgroundColor = "green";
            }else{
                table.rows[i].cells[j].style.backgroundColor = "red";
            }
        }
    }
}


function tdF(){
    clicks++;
    var num = event.target.innerHTML;
    fullNum+=parseInt(num);
    if(event.target.style.backgroundColor=="red"){
        num--;
        event.target.innerHTML = num;
        event.target.style.backgroundColor="green";
    }else{
        num++;
        event.target.innerHTML = num;
        event.target.style.backgroundColor="red";
    }

    if(clicks>=10){
        var button = document.getElementById("button");
        button.disabled = false;
        alert("Μέσο όρο : "+fullNum/clicks);
    }
}

//Askisi 4
function showDiv(){
    var div = document.getElementById("thematikesEnotites");
    div.style.display="block";
}

function insertThematikes(){
    var roThematikes = document.getElementById("tnText");
    var slThematikes = document.getElementById("tnSelect");
    roThematikes.value = slThematikes[slThematikes.selectedIndex].innerHTML;
}

function hideDiv(){
    var div = document.getElementById("thematikesEnotites");
    div.style.display="none";
}

function submit(){
    var titlos = document.getElementById("titlos").value;
    var suggrafis = document.getElementById("suggrafis").value;
    var thematikiEnotita = document.getElementById("tnText").value;
    var console = document.getElementById("console");
    console.innerHTML="Τίτλος : "+titlos+"<br/>Συγγραφής : "+suggrafis+"<br/>Θεματική Ενότητα : "+thematikiEnotita;
}
//Askisi 5
var timer;
var run;
var green=0;
var red=0;
function startGame3(){
    timer=10;
    event.target.disabled ="disabled";
    var table=document.getElementById("table");
    for(var i=0; i<table.rows.length; i++){
        for(var j=0; j<table.rows[i].cells.length; j++){
            table.rows[i].cells[j].setAttribute('onclick' , 'rule1()')
            table.rows[i].cells[j].innerHTML = Math.floor(Math.random()*10);
        }
    }
    run = setInterval(timerF,1000);
}

function timerF(){
    if(timer==0){
        var button = document.getElementById('button');
        button.disabled="";
        clearInterval(run);
        alert("Έγιναν πράσινα : "+green+" και κόκκινα : "+red);
    }
    var timeScreen = document.getElementById("timer");
    timeScreen.innerHTML = timer;
    timer--;
}

function rule1(){
    if(event.target.innerHTML>5){
        event.target.style.backgroundColor = "green";
        green++;
    }else{
        event.target.style.backgroundColor = "red";
        red++;
    }
}
//Askisi 6
var Imgindex = 0;
var img1 = ['bookimg/p1.jpg','bookimg/p2.jpg','bookimg/p3.jpg','bookimg/p4.jpg','bookimg/p5.jpg','bookimg/p6.jpg'];

function startSlideShow2(){
    interval = setInterval(nextImg , 1000);
    var buttons = document.getElementsByTagName("input");
    buttons[0].disabled="disabled";
    buttons[1].disabled="disabled";
}

function nextImg(){
    var screens = document.getElementsByTagName("img");
    switch(Imgindex){
        case 0:
            screens[0].src=img1[Imgindex];
            screens[0].width="80";
            screens[0].height="80";
            screens[2].width="50";
            screens[2].height="50";
            screens[1].src=img1[Imgindex+1];
            screens[2].src=img1[Imgindex+2];
            screens[3].src=img1[Imgindex];
            Imgindex++;
            break;
        case 1:
            screens[0].src=img1[Imgindex-1];
            screens[0].width="50";
            screens[0].height="50";
            screens[1].width="80";
            screens[1].height="80";
            screens[1].src=img1[Imgindex];
            screens[2].src=img1[Imgindex+1];
            screens[3].src=img1[Imgindex];
            Imgindex++;
            break;
        case 2:
            screens[0].src=img1[Imgindex-2];
            screens[1].width="50";
            screens[1].height="50";
            screens[2].width="80";
            screens[2].height="80";
            screens[1].src=img1[Imgindex-1];
            screens[2].src=img1[Imgindex];
            screens[3].src=img1[Imgindex];
            Imgindex++;
            break;
        case 3:
            screens[0].src=img1[Imgindex];
            screens[0].width="80";
            screens[0].height="80";
            screens[2].width="50";
            screens[2].height="50";
            screens[1].src=img1[Imgindex+1];
            screens[2].src=img1[Imgindex+2];
            screens[3].src=img1[Imgindex];
            Imgindex++;
            break;
        case 4:
            screens[0].src=img1[Imgindex-1];
            screens[0].width="50";
            screens[0].height="50";
            screens[1].width="80";
            screens[1].height="80";
            screens[1].src=img1[Imgindex];
            screens[2].src=img1[Imgindex+1];
            screens[3].src=img1[Imgindex];
            Imgindex++;
            break;
        case 5:
            screens[0].src=img1[Imgindex-2];
            screens[1].width="50";
            screens[1].height="50";
            screens[2].width="80";
            screens[2].height="80";
            screens[1].src=img1[Imgindex-1];
            screens[2].src=img1[Imgindex];
            screens[3].src=img1[Imgindex];
            Imgindex=0;
            break;
    }
}

function stopOnLoad(){
    clearInterval(interval);
    var buttons = document.getElementsByTagName("input");
    buttons[0].disabled="";
    buttons[1].disabled="";
}
//Askisi 7
var clicks = 0;
function fill2(){
    var randomNumber;
    var table = document.getElementById("table");
    for(var i=0; i<=4; i++){
        table.insertRow(i);
        for(var j=0; j<=4; j++){
            table.rows[i].insertCell(j);
            table.rows[i].cells[j].innerHTML = Math.floor(Math.random()*90+10);
            table.rows[i].cells[j].setAttribute("onclick" , "clicked()");
        }
    }
}
var colorNumber="";
function clicked(){
    event.target.setAttribute("onclick" ,"alreadyClicked()")
    clicks++;
    colorNumber +=event.target.innerHTML;
    if(clicks==3){
        clicks=0;
        var div = document.createElement("div");
        div.style.backgroundColor = "#"+colorNumber;
        div.innerHTML = colorNumber;
        var p = document.getElementById("panel");
        p.appendChild(div);
        colorNumber="";
    }
}
function alreadyClicked(){
    alert("Cell already Clicked");
}

function pandesia(){
    var divs = document.getElementsByTagName("div");
    var i =0;
    setInterval(function myfuction(){
        document.body.style.backgroundColor = divs[i].style.backgroundColor;
        i++
    },3000);
}

//Askisi 8
function onLoad(){
    var table = document.getElementById("picTable");
    for(var i=0; i <table.rows[0].cells.length; i++){
        table.rows[0].cells[i].setAttribute("onclick","stealImage()");
    }
}
var cellIndex = 0;
function stealImage(){
    var lineTable = document.getElementById("lineTable");
    lineTable.rows[0].insertCell(cellIndex);
    lineTable.rows[0].cells[cellIndex].appendChild(event.target);
    var parent = event.target.parentNode;
    parent.removeChiled(event.target);
}

function returnTheStolen(){
    var i =0;
    var lineTable = document.getElementById("lineTable");
    var picTable = document.getElementById("picTable");
    setInterval(function myfuction(){
        picTable.rows[0].cells[i].appendChild(lineTable.rows[0].cells[i].childNodes[0])
        i++;
    },3000);
}
//Askisi 9