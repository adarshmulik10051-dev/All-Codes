let btns = document.querySelectorAll('button');
console.dir(btns);


//Events
    //1)onclick event --> when you prees button run function

    btns.onclick=function sayHello() {
        console.log("liked photo ")
    };

    // multiple button acees 
    for(btn of btns){
       btn.onclick=like;// for function calling we not use () because the function will run all time  
    }

    function like(){
        alert("you like a photo");
    }

   // 2)onmouseenter
    function onmouseen (){
            console.dir("you hover on button");
         }

    for(btn of btns){
             btn.onmouseenter=onmouseen;  
         }
         
    //3)addEventListener(event,function)-->used for handel multiple function on one elemets events-->click , dblclick 

    function printname(){
        console.log("adarsh")
    }
    function printsurname(){
        console.log("mulik");
    }
        for(btn of btns){
        btn.addEventListener("dblclick",printname);//function call 1
        btn.addEventListener("dblclick",printsurname)//;function call 2
    }

    