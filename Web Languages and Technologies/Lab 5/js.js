//Askisi 1
function add(){
    var num1 = parseInt(document.getElementById("num1").value);
    var num2 = parseInt(document.getElementById("num2").value);
    var res = num1+num2;
    var x = document.getElementById("res");
    x.textContent =res;
}
//Askisi 2
function openUrl(){
    var url = document.getElementById("urlTextBox").value;
    window.location.assign(url);
}

//Askisi 3
function openUrl2(){
    var url = document.getElementById("url").value;
    var x = window.open(url,"_blank", 'width=200px , height=200px, menubar=no,toolbar=no');
}

//Askisi 4
function changeColour(){
    var colour = document.getElementById("colour").value;
    var bgcolour = document.getElementById("bd").style.background=colour;
}
//Askisi 5
function showInfo(){
    var language = navigator.language;
    var browser = navigator.appName +" "+ navigator.appVersion+" "+navigator.appCodeName;
    var panel = document.getElementById("textPanel");
    if(language=="en-GB"){
        panel.value= "Browser : "+browser+"\nLanguage : "+language;
    }else{
        panel.value="Περιηγητής : "+browser+"\nΓλώσσα : "+language;
    }
}

//Askisi 6
function showDP(){
    var selection = document.getElementById("selector");
    var option = selection.options[selection.selectedIndex].value;
    var info;
    if(option=="path"){
        info = location.pathname;
        alert("Path name : "+info);
    }else{
        info = location.hostname;
        alert("Domain : "+info);
    }
}