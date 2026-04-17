//1)IF statement--->

let age = 18 ; 
console.log("before if work");
if (age>=18){
    console.log("you can drive ");
}
console.log("after if work ");

//2) p q signal traffic -->

let color="red";

 if(color=="red"){
    console.log("now stop!!");
 }
 if(color=="yellow"){
    console.log("get slow now");
 }
 if(color=="green"){
    console.log("go ahead");
 }

 //3) else if statement 

 let marks = 75;

 if(marks>=75){
    console.log("you pass!!");
 }
 else if(marks<=75){
    console.log("fail!!");
 }

 //4) else codition 

 let balance= 800;
  if(balance>=500){
    console.log(` you can pay &account balance is ${balance} `);
  }else{
    console.log("insufficient bank balance!!")
  }

  //5) Practice question
  
  let size="s";

  if(size== "xl"){
    console.log("price is RS.250");
  }
else if(size=="l"){
    console.log("price is RS.200 ");
}else if(size=="m"){
    console.log("price is RS.150");
}
 if(size=="s"){
    console.log("price is RS. 100");
}

//6)if - else

     let mark = 35;
     if(mark>=35){
        console.log("pass");
        if(mark>=80){
            console.log("grade is : o+");
        }else{
            console.log("grade is A");
        }
     }else{
        console.log("Better luck next time");
     }

     //7) switch statement 

     let choice ="3";

     switch (choice){
      case "1":
      console.log("samosa");
      break;
      case"2":
      console.log("fruity");
      break;
      case"3":
      console.log("mogu mogu");
      break;
      default:
         console.log("not availabel")
     }

     //8)use switch statement to print day of the week

     let day="8";

     switch(day){
         case"1":
         console.log("monday");
         break;
         case"2":
         console.log("tuesday");
         break;
         case"3":
         console.log("wednesday");
         break;
         case"4":
         console.log("thursday");
         break;
         case"5":
         console.log("friday");
         break;
         case"6":
         console.log("saturday");
         break;
         case"7":
         console.log("sunday");
         break;
         default:
            console.log("choose correct option ");
     }


     // Alert and prompt
     alert("this is the main work");
     console.error("this the error log");
     console.warn("this is the warn log");
     //prompts

    let firstName= prompt("enter your first name:");
    let lastNmae= prompt("enter you last name");
    console.log("Welcome",firstName," ",lastNmae,"!");

     



