//Askisi 1
function showInfo(evt){
    var element = document.getElementById("element");
    var content = document.getElementById("content");
    element.value = evt.target.nodeName;
    content.value = evt.target.innerHTML;
}

//Askisi 2
var counter = 0 ;
function gotClicked(evt){
    counter +=1;
    if(counter<=3){
        evt.target.innerHTML = "I got Clicked!";
    }else{
        alert("Stop! You killed to many list items :(");
        document.getElementById("dad").onclick = null;
    }
}

//Askisi 4
function linkCss(){
    var x = document.getElementsByTagName("a");
    for(i=0; i<x.length; i++){
        x[i].setAttribute("class","linkCss");
    }
    
}

//Askisi 5
function crAttribute(){
    var attributes= document.getElementById("attribute");
    var attribute = attributes.options[attributes.selectedIndex].value;
    var colours = document.getElementById("colour");
    var colour = colours.options[colours.selectedIndex].value;
    var display = document.getElementById("created");
    attribute = document.createElement(attribute);
    display.appendChild(attribute);
    attribute.innerHTML = "Created Attribute";
    attribute.setAttribute("class", colour);
}

//Askisi 5b
counter2 = 0;
function crAttribute(){
    var attributes= document.getElementById("attribute");
    var attribute = attributes.options[attributes.selectedIndex].value;
    var colours = document.getElementById("colour");
    var colour = colours.options[colours.selectedIndex].value;
    var display = document.getElementById("created");
    display.innerHTML = "<"+attribute+">Created Attribute<"+attribute+"/>";
    attribute = document.getElementsByTagName(attribute);
    attribute[counter2].setAttribute("class", colour);
    counter2++;
}