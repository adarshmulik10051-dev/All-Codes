//all concepts in js
//1. what is js ?
//js is programming  language that make website interactive.

//2. console.log() in js :print o/p in window 
console.log("hello world");

//3.variables in js : used to store data 
let surname = "Mulik";// surname is variable 

//4. Datatypes in js  : number,string,boolean,null, undefined 
let name = "Adarsh";// mostly used
var surnames ="Mulik";// old method 
const pi = 3.14 ;// nonchangble values   

//5.NAN is js: Not A Number
let res ="abc"*3 ;
let res1 = 103/0;
console.log(res);

//6.null vs undefined 
//6.1 null : declared but not defined 
 let a = null ; 
 console.log(typeof(a));
 //6.2 undefined :declard but not defined 
 let b ; 
 console.log(typeof(b));

//7.Alerts and prompts 
//7.1 alerts: show alert pop up
// alert("hello");
//7.2 prompts:take input from users 
// let pr = prompt("enter your name ");
// console.log(`hello ${pr}`);

//8.conditional statement
//8.1 if else 
//8.2 if else nested 
//8.3 switch

//9.how to attach js file --> 
//before </body>--> <script src="app.js"></script>
  
//10.Strings 
//10.1 How to declare:
let str = " adarsh";
//10.2 String literls 
console.log(`my name is ${str} and my age is ${pi}`);

//10.3string methods 
console.log(str.length); //return length of string 
console.log(str.charAt(2));//retrun char at the index 2
console.log(str.substring(0,2));// gretrun substring from si to ei exclud 
console.log(str.indexOf('n'));// retrun index of 'n'
console.log(str.replace("name","pic"));//replace set of char to in og string 
console.log(str.toUpperCase());//retrun overall string in uppercase
console.log(str.slice(0,3));//it same as substring but slice in string 

//10.3 method chaining : it combine the method use together 2 or mr methods
 let res3 = str.toUpperCase().trim();

//11 Arrays:
//11.1 How to declare Arrays 
 let arr =[1,2,3,4,5];
 let multipleData=[1,'a',"adarsh",true];
 console.log(multipleData);

//11.2 Basic Arrays Methods
console.log(arr.length);//retrun length of array
console.log(arr.indexOf(2));//retrun value of idx
console.log(arr.includes(0));//retrun boolean value 
console.log(arr.sort);//sort the given array 
console.log(arr.concat(multipleData));//combine and return both array two arr in one 

//**push pop shift unshift slice spilce **
arr.push(4);
console.log(arr);//add data last of the array 

arr.pop();
console.log(arr);//remove from last of arr

arr.unshift(4);
console.log(arr);//add data to start of the array 

arr.shift();
console.log(arr);// remove the data from start of the array 

//splice 
//used to remove, add, replace 
//remove:
arr.splice(1,2);
console.log(arr);// start at index 1 remove 2 elements [1,2,3,4,5]-->[1,4,5]

//add:
arr.splice(1,0,100); //start at ind 1 , remove 0 element , add 100 
console.log(arr);

//replace :
arr.splice(0,1,50,60);// start at idx 0 , remove 1 element , add 50 and 60 
console.log(arr);


//11.3 constant array : 
//it does not make array immutable 
// it reassignment and updating is not possible 
const nums = [1,2,3,4];
nums.push(5);//possible
nums[5]=4;//possible
console.log(nums);
//nums=[8,9,10] not possible 

//11.4 nested arrays
let pairs = [[2,4],[3,4],[5,4]];
console.log(pairs);


//12 loops 
//to do repeat the same work 
//12.1 for loop :
    for(let i = 0 ; i < 5 ; i ++){
        console.log(i);
    }
//12.2 nested loop :
for(let i = 0 ; i < 5 ; i ++){
    for (let j = 0 ; j < 3 ; j ++){
        console.log(i,j);
    }
}    

//12.3while loop :
// while(cdn){work};
let i =1 
while(i<5){
    console.log(i);
    i++;
} 

//12.4 loops with array and strings
let numb=[1,2,3,4];
for(el of numb){
    console.log(el);
}
  let myName ="adarsh"
  for (char of myName){
    console.log(char);
  }

  //14 object literals : collection of multiple properties 
  //properties contain key:value pairs
  //14.1how to create :
  let students={
      name:"adarsh",
      age:20,
      isStudent:true
  }
  //14.2 how to acess
 console.log(students.name);
 //14.3how to add properties
 students.city="mumbai";
 //14.4 how to update properties
 students.age=21;
 console.log(students);
 //14.5 how to delete 
 delete students.isStudent;
 console.log(students);

// 14.6 object inside object// nested object 
const dada ={
    adarsh:{
        age:21,
        marks:99
    },
    sarthak:{
        age:21,
        marks:100
    }
}
console.log(dada.sarthak.marks);

//14.5 array objects
const array = [
    {name:"xyz",age:20},
    {name:"abc",age:21}
];
console.log(array[0].age);

// 14.6Math Objects:
console.log(Math.max(3, 4));
console.log(Math.min(3, 4));
console.log(Math.round(3.49));
console.log(Math.floor(3.9));
console.log(Math.ceil(3.2));
console.log(Math.abs(-45));
console.log(Math.pow(2, 3));
console.log(Math.sqrt(169));
console.log(Math.PI);
console.log(Math.E);
console.log(Math.random());

//14.6 genrate random number from given range 
//1. use Math.random()-> any random no bet 0-1 excluid ex-0.342
//2.multiply with 10 for 3.42 --> here you multiply by n mean range tou want 
//3.use Math.floor()-> for  ->3
//4.add 1 to result -> 4 (because 1 is not inculid )

let randomNumber=Math.floor(Math.random()*100)+1;
console.log(randomNumber);

//15functions in js 
//15.1how to declare 
function sum(a,b){
    return a+b;
}

//15.2 Scopes
//block scope --> {let a =10;}; print(a) not possible 
//function scope -->function(){return a+b} print(a) is not valid
//glooble scope--> available anywhere

//15.3 try catch method
try{
    console.log("hello"+d);// if not work get error
}catch(err){
    console.log(err); //print actual error but not in red 
}

//16.arrow Function 
//16.1.how to declare: 
const sub=(a ,b)=>{
    return a-b;
};
console.log(sub(4,2));

const power =(x)=>{
    return x*x;
};
console.log(power(2));

//16.2 settimeout(fxn ,time);
//print after once after one after delay in x ms 
setTimeout(()=>{
    console.log("hi rucha!!");
},5000);//after 5 sec print once at time 

//16.3setinterval(fxn,time)
// print repeativly infinite time gap of time
const id =setInterval(()=>{
    console.log("monya");
},2000);

//16.4how to stop setiterval fxn:
setTimeout(()=>{
    clearInterval(id);
},10000);

//#**17.this keywordin js :
 // this mean ->>which obj own mw right now 

/*
Think of it like :
    *"Who is calling me  right now "

    1. in a normal object method 
    const user ={
        name:adarsh,
        greet(){
            console.log(this.name);
        }
    };
    user.greet();
    Here:
    this → refers to user
    So output: "Amit"
    
        2. In a regular function (not inside object)
        function show() {
        console.log(this);
        }
        show();

        Here:
        In strict mode → this is undefined
        In non-strict mode → this is window (browser global object)
    
        3.In an arrow function
        Arrow functions do not have their own this.
        They take this from the surrounding scope.

        const obj = {
        name: "Amit",
        greet: () => {
            console.log(this.name);
        }
        };
        obj.greet();

        Here:
        this is NOT obj
        It comes from outside → usually window or undefined
        So this.name is not "Amit"
    
        Simple rule to remember

👉 this depends on how the function is called, not where it is written.
    */ 

// 18.arrays important methods 
//18.1 forEach(fnx):loop thorugh each element in an array 
// arr.forEach(()=>{});
//it does not return new array 
//it always return undefined
let arr1= ["apple", "mango","gouva"];
let arr2=[1,2,3,4,5];

arr1.forEach((x)=>{
    console.log(x*x);//NAN
});

arr1.forEach((num, idx) => {
      console.log(`${idx + 1}.${num}`);
});

//18.2.map(fnx): create new arr applying function on each ealement
//arr.map(()=>{});
//Map() return a new arr

let newarr = arr2.map((el)=>{
    return el*2;
});
console.log(newarr);

//18.3. filter(fxn): contains the only element that pass cdn 
let even =arr2.filter((el)=>{
    return el%2==0;
});
console.log(even);

//18.4 every(fxn): the all el pass the cdn then return true else false
let result = arr2.every((el)=>{
    return el%2==0;
});
console.log(result);

//18.5.reduce(fxn) :reduce the array to single value 
//arr.reduce((accumalator,currentvalue)=>{},initialvalue);
const addition = arr2.reduce((res,el)=>{
    return res+el;
},0);
console.log(addition);

let maxarr=[1,2,3,45,6];
const max = maxarr.reduce((max,el)=>{
    if(max<el){
        return el;
    }else{
        return max ;
    }
});
console.log(max);

// 19. default parametr:give value for arg 
// function (a,b=3);b=3 default


 // defualt parameter ->> it give value to arguments

  function sum(a,b=2){// (2,3)pass kela tr 5 denar ,, (1)pass kela tr b default 2 ghenar anni 3 return karel
    return a+b  ;
  }
  let sum1 = sum(1);//1+default value 2 = 3
  let sum2 = sum(4,5);// 4+5 = 9;
  //(a=3,b) is not valid , value assign by order


  // spred function-->function name(...arr);

Math.min(set[0],set[1],set[2],set[3]);//each element will be pass but we use spred then it can go into one by one automatically

console.log(Math.min(...set));

console.log(..."adarshmulik");

//spred with array litrales
let even = [2,4,6,8,10];
let odd =[1,3,5,7,9];
let both = [...even,...odd];

//spred with object litrals


const data={
  email:"adarshmulik@gmail.com",
  pass:"adarsh1202"
};

const datacopy={
  ...data,
  id:12
};

//rest function (...args)

 function sum(...args){
     return args.reduce((sum , el)=> sum+el  );
 }

 //also you (msg, a,...args)--> first &sec vaule assign to msg and a then make aaray

 // destructuring 

 let name = ["adarsh","sathak","harsh","dk","ro","shera"];
 let [winner , runnerup,potm,pos,...players]=name;// insted of let winner = name[0],runnerup=name[1] so on;
 console.log(winner);

 //destructuring on object

 const student = {
  name:"nadarsh",
  age:12,
  class:12,
  subjects:["marathi","hindi","histroy"],
  username:"@adarsh12",
   pass:"abcd"

 }

 let{name, age,pass:secret,username:user}=student;// pass search hoil ahhe ka object mde pass la appan secrect bolu shakto  and username la user  











