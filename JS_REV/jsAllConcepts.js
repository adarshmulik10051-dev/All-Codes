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











