//Askisi 1
function getFocus(obj){
    obj.style.backgroundColor ="yellow"
    }
    
    function looseFocus(obj){
        if(obj.value.length==0){
            obj.style.backgroundColor ="red"
        }else{
            obj.style.backgroundColor ="white"
        
        }
    }

//Askisi 2
var numArray=new Array

for (var i=0;i<=2;i++){
  numArray[i]=Math.ceil(Math.random()*4)
}

alert("You will be asked to guess three numbers I have picked.")

for (j in numArray){
  guess=prompt("Guess between 1 and 4. Cancel will exit.","")

  while((guess==numArray[j])&&(guess!=0)){
    guess=prompt("Nope! Try again or type 0 to quit.","")
  }

  if (guess==0){
    if(confirm("OK to quit, Cancel to guess the next number.")){
      break
    }
    else{continue}
  }

  alert("That's right!")
}

alert("Goodbye!")

//Askisi 3
function changeImg(obj)
{

image=obj
image.src="Sunset.jpg";

}

function changeImgBack(obj){

image = obj
image.src="Bluehills.jpg";

}

//Askisi 4
function evaluatecode( obj )
{
   document.getElementById("output").innerText=eval(obj.sDbg.value)
}

//Askisi 6
function changeIcon(){
    var canvas = document.getElementById("er");
    canvas.src = "Bluehills.jpg";
}

//Askisi 8
function rndNum(maxNum){
    num=Math.random()
    num=num*maxNum;
    num=Math.ceil(num)    
    try{
        if(isNaN(num)){throw "Error : NaN";}
    }catch(err){
        return -1;
    }
    return num
  }

function tellUser(specifiedNum){
    var x = rndNum(specifiedNum)
    if(x==-1){
        alert("Error : String detected");
    }else{
        alert(x);
    }
  }