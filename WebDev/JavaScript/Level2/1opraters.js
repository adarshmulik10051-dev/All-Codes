//1)arithmatic operaters(binary)
let a= 10 ;
let b = 5;

console.log("sum is:",a+b);
console.log("Diff is:",a-b);
console.log("multi is:",a*b);
console.log("div is",a/b);
console.log("Reminder is:",a%b);
console.log("a power b:",a**b);

//2) unary operater
let c = 5;
console.log("++a is:",c++);
console.log("a++ is:",++c);

//3)assignment operater
// += , -= , *= , /= , 
let x = 10;
let y= 5;
y=x;
console.log(y);

//4) comparision operaters - compare two value's

let age = 18;
console.log(age>18);
console.log(age>=18);
console.log(age==18);
console.log(age<17);
console.log(age<=18);
console.log(age!=18);

//5)logical operaters

let marks=90;
if(marks>=32&&marks>=80){
    console.log("you pass with A+ grade");
}

//practise question 

let string = "apple";

if( (string.length>3) && (string[0]=="a") ){
    console.log("The string is good.")
}else{
    console.log("String is not good .");
}






