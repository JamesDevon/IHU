
//1
function loadCategories(){
    var op1 = document.createElement("option");
    op1.text = "Όλα";
    op1.value= 'k';
    
    var selector = document.getElementById("categorySelector");
    selector.add(op1);
    for(var i=0; i<categories.length; i++){
        var op = document.createElement("option");
        op.text = categories[i];
        op.value = i;
        selector.add(op);
    }   
}

//2
function loadProducts(){
    var table = document.getElementById("productTable");
    table.innerHTML = "";
    var selector = document.getElementById("categorySelector");
    var id = selector.options[selector.selectedIndex].value;
    var k = 0;
    if(id=="k"){
        for(var i=0; i<products.length; i++){
                table.insertRow(i);
                for(var j=0; j<products[0].length+1; j++){
                    table.rows[i].insertCell(j);
                    if(j==1){
                        var img = document.createElement("img");
                        img.src= products[i][j];
                        img.width = "50";
                        table.rows[i].cells[j].appendChild(img);
                    }else if(j==2){
                        
                    }else{
                        table.rows[i].cells[j].innerHTML = products[i][j];
                    }
                }
        }
        for(var i=0; i<table.rows.length; i++){
            table.rows[i].insertCell(0);
            var btn = document.createElement("INPUT");
            btn.setAttribute("type","button");
            btn.setAttribute("value","Προσθήκη");
            btn.setAttribute("onclick","addToCart(this)");
            table.rows[i].cells[4].appendChild(btn);
        }
        
        
    }else{
        for(var i=0; i<products.length; i++){
            if(products[i][3]==id){
                table.insertRow(k);
                for(var j=0; j<products[0].length; j++){
                    table.rows[k].insertCell(j);
                    if(j==1){
                        var img = document.createElement("img");
                        img.src= products[i][j];
                        img.width = "50";
                        img.setAttribute("onclick","showImg(this)");
                        table.rows[k].cells[j].appendChild(img);
                    }else{
                        table.rows[k].cells[j].innerHTML = products[i][j];
                    }
                }
                k++;
            }
        }
        for(var i=0; i<table.rows.length; i++){
            table.rows[i].insertCell(0);
            var btn = document.createElement("INPUT");
            btn.setAttribute("type","button");
            btn.setAttribute("value","Προσθήκη");
            btn.setAttribute("onclick","addToCart(this)");
            table.rows[i].cells[4].appendChild(btn);
        }
    }
    
}
//3
function showImg(evt){
    var pic = evt.cloneNode(true);
    var el = document.createElement("img");
    el.src=pic.src;
    var frame = document.getElementById("canvas");
    frame.appendChild(el);
    frame.style.display = "block";
    setTimeout(function myFunction(){
        frame.removeChild(el);
        frame.style.display ="none";
    },3000);
}

//4&5
function addToCart(evt){
    var qnt = 1;
    var cell = evt.parentNode;
    var row = cell.parentNode;
    var name = row.cells[1].innerHTML;
    var price = row.cells[3].innerHTML;
    var cart = document.getElementById("cartTable");
    var flag = false;
    for(var i=0; i <cart.rows.length; i++ ){
        if(name==cart.rows[i].cells[0].innerHTML){
            flag = true;
            cart.rows[i].cells[2].innerHTML=parseInt(cart.rows[i].cells[2].innerHTML)+parseInt(qnt);
        }
    }
    if(!flag){
        cart.insertRow(cart.rows.length);
        cart.rows[cart.rows.length-1].insertCell(0);
        cart.rows[cart.rows.length-1].insertCell(1);
        cart.rows[cart.rows.length-1].insertCell(2);
        cart.rows[cart.rows.length-1].cells[0].innerHTML =name;
        cart.rows[cart.rows.length-1].cells[1].innerHTML =price;
        cart.rows[cart.rows.length-1].cells[2].innerHTML =qnt;
    }
}