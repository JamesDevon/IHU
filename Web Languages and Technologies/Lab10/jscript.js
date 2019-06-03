//Askisi 1 

var index = 1;
var pics = ['bookimg/p1.jpg','bookimg/p2.jpg','bookimg/p3.jpg','bookimg/p4.jpg','bookimg/p5.jpg','bookimg/p6.jpg','bookimg/p7.jpg','bookimg/p8.jpg','bookimg/p9.jpg','bookimg/p10.jpg','bookimg/p11.jpg','bookimg/p12.jpg','bookimg/p13.jpg','bookimg/p14.jpg','bookimg/p15.jpg'];
var int;

function stopInt(){
    clearInterval(int);
}

function startInt(){
    int = setInterval(next, 1000);
}

function next(){
    var img = document.getElementById("img");
    if(index==14){
        index=0;
    }else{
        index++;
    }
    img.src = pics[index];
}

//Askisi 2 

function start(){
    var time = document.getElementById('time_TextBox').value;
    time *=1000;
    int = setInterval(next, 1000);
    setTimeout(stopInt,time);
}

//Askisi 3
function loadSelector(){
	var t = document.getElementsByTagName("p");
	var box;
	var selector = document.getElementById("select");
	for(var i=0; i<t.length; i++){
		var option = document.createElement("option");
		option.text = t[i].innerHTML.substr(0,50);
		selector.add(option);
		}
	selector.selectedIndex = 1;
	}

function view(){
    var ps = document.getElementsByTagName('p');
    var ind = document.getElementById("select").selectedIndex;
    ps[ind].scrollIntoView();
    ps[ind].style.fontWeight ="bold";
}

//Askisi 4
function function1(){
	var x = document.getElementsByTagName("a");
	for(var i=0; i<x.length; i++){
        alert(i);
		x[i].setAttribute("onclick" , function2);
		}
	}

function function2(){
	var r = confirm("Do you want to change page?");
	if(r==true){
		window.href = event.target.href;
	}
}
