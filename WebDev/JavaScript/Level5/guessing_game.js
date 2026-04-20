const max = prompt("enter the max range:");
const random=Math.floor(Math.random()*10)+1;
let guess = prompt("guess the number");

while(true){

    if(guess=="quite"){
        console.log("quite the game");
        break;
    }

    if(guess==random){
        console.log("you are right! ,you won! the random no is:",random);
        break;
    }

    else if(guess>random){
        guess=prompt("you enter big !! try small no")
    }else{
         guess=prompt("you enter small !! try big no")
    }
}