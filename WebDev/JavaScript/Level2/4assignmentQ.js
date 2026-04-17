//1.Create a number variable num with some value.
//  Now, print “good” if the number is divisible by 10 and print “bad” if it is not.
let num= 3 ; 
 if( num%10==0 ){
    console.log("good");
 }else{
    console.log("bad");
 }


 // 2) Take the user's name &age as input using prompts. 
 // Then return back the following statement to the user as an alert 
 // (by substituting their name & age):
 // name is age years old.

 let userName= prompt("Enter user name:");
 let age = prompt("Enter age:");
 
 alert(`${userName} is ${age} years  old.`);

 //3)Write a switch statement to print the months in a quarter
 //1-3-->jan frb march is Quarter 1then next 
 let quarter="5";
 switch(quarter){
    case"1":
    console.log("jan feb march");
    break;
    case"2":
    console.log("april may june");
    break;
    case("3"):
    console.log("july aug sept");
    break;
    case"4":
    console.log("oct nov dec");
    break;
    default:
    console.log("choose wrong Quarter");
 }

//4)A string isa golden string if it start swith the character ‘A’ or ‘a’ and has a total length greater than 5

    let string = "apples";

    if( string[0]=="A"|| string[0]=="a" && (string.length>5)){
        console.log("golden string");
    }else{
        console.log("not a golden string");
    }   
    
//5)Write a program to find the largest of 3 numbers

let a = 4;
let b = 8 ;
let c = 3;

if(a>b && a>c){
    console.log(a+"is greatar");
}else if(b>c && b>a){
    console.log(b+"is greater");
}else{
    console.log(c+"is greater");
}


//6)(Bonus).Write a program to check if 2 numbers have the same lastdigit.
//  Eg:32 and 47852 have the same lastdigit i.e.2

let num1= 32;
let num2=47852;


if(num1%10==num2%10){
    console.log(`same last digit is :${num%10} `);

}else{
    console.log("not a same digit");
}


