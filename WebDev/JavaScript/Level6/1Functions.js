// functions 

function printHello(){
    console.log("Helloo!!");
}

//printHello();

function printName(){
    console.log("BVCOE");
    console.log("Adarsh Mulik");
}

//printName();

function toPrint_1to_5(){
    for(let i = 0 ; i <= 5 ; i ++){
        console.log(i);
    }
}
//toPrint_1to_5();

//pq-1 print a poem using function

function poem(){
    console.log("Tuzi tulach puri karaychi");
    console.log("House unch akashi udaychi");
    console.log("aai bapa chya payavr dok");
    console.log("baki jagashi raha rok thok");
    console.log("duniya uchlun ghenar hay r ");
    console.log("duniya dokyavr ghenar hay rr!!");
}
poem();

// make dice and print value of the each time

function rollDice(){
    let num = Math.floor(Math.random()*6)+1;
    console.log(`value of dice ${num}`);
}
rollDice();

//functions with arguments and paprmeter

function printInfo(name,age){
    console.log(`${name}'s age is ${age}.`)
}

printInfo("adarsh",23);
printInfo("adarsh");

function sum( a , b){
    console.log(` sum is : ${a+b}`);
}
sum(1,3);


// pq- avrage of 3 number

function calAvg(a,b,c){
    console.log(`avrage of ${a},${b},${c} is ${(a+b+c)/3}`);
}

calAvg(1,2,3);

//pq- multipication tabel no 

function printTable(n){
    console.log(`Printing table of ${n}-->`);
    for( let i = 1 ; i <=10 ; i ++){
        console.log(`(${n}*${i})=${i*n}`);
    }
}
printTable(2);

//use return keyword


function sum(a,b){
    return a+b ; 
}

let s=sum(2,3);
console.log(`sum is ${s}`);

// also we can function call in to call

console.log(sum(sum(1,2),3));

//return sum 1 to n

function sum1_To_n(n){
    let sum1=null;
    for(let i = 1 ; i <= n; i++){
        sum1 =sum1+i; 
    }
     return sum1;
}

let sum_n = sum1_To_n(5);
console.log(sum_n);

//concat the all string in one



function concate(strings){
    let result="";
    for (let i = 0 ; i < strings.length; i++){
        result+=strings[i];
    }
    return result;
}


let strings=["adarsh","!","21"];
let r =concate(strings);
console.log(r);
//scope --> 1)lexical ,block, function

let greet = "hello";//global scope
 function outerFun(){
    let greet="Namste"//functio  scope
    console.log(greet);
    function innerFun(){
        console.log(greet);//lexical scope
    }
    innerFun();
 }
 console.log(greet);
 outerFun();
//function expression --> It also say name less function the fuction directly store in varable 

let name = "adarsh";

let sum3 = function(a,b){// the return value is stored in sum variable 
    return a+b;
}// how to call the function  

console.log(sum3(1,2));


//higher order function
function multiGreet(funct,count){//highr order function
    for(let i= 0 ; i < count ; i ++){
        greete();
    }
}
let greete = function(){
    console.log("hello");

}
multiGreet(greete,3);

// higher order -- . thats return the functions value 

function oddEvenTest(request){
    if(request=="odd"){
        let odd = function(n){
            console.log(!(n%2==0));
        }
        return odd ;
    }else if(request=="even"){
        let even = function(n){
            console.log((n%2==0));
        }
        return even ;
    }else{
        console.log("Not correct choice");
    }
}
let request="odd";
let func =oddEvenTest(request);

//methods is like object here the properties is the function key is function name and vaule is the function


let calculator ={
    add:function(a,b){
        return a+b ;
    },
    sub:function(a,b){
        return a-b;
    },
    mul:function(a,b){
        return a*b;
    }

};
console.log(calculator.mul(1,2));
