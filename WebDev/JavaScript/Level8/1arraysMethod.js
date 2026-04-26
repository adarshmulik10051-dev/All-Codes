// arrays method 

//1) forEach method --> used to itrate each valule in string or array like for of loop 
let array =[1,2,3,4,5,6];

//method 1 -->make another function then call it and pass function
 let print = function (el){
    console.log(el);
 }
  array.forEach(print);

  //method 2 --> function name(wrong) function(correct)

  array.forEach(function(el){
        console.log(el);
  });
  

  let arr = [
    {
    name:"adarsh",
    marks:95,
  },
  {
    name:"sarthak",
    marks:96,
  },
  {
    name:"harsh",
    marks:97,
  }
];

  arr.forEach((students)=>{
    console.log(students.name);
  })


  // map function arr.map(function or name);

  let num = [1,2,3,4,5];

 let newarr=  num.map((el)=>{
    return el*2;
  });
  

  //3)filter function --> arr.filter(function or name); it can br callback value true asel new array mde add karel

  let nums = [1,2,3,4,5,6,7,8]
  let newNums = nums.filter((el)=>{
     return el%2==0;
  });

 // 4) every function --> arr.every(function or name);it can be when the every element can be return true of array then it return true else false;

 let number=[2,4,6,8];

 let tf=number.every((el)=>{
     el%2==0
 });
 console.log(tf);

 //5)reduce function -->arr.reduce(function with 2 arg 1 is acculmator and 2 element );
// these function  return single value 
 let arr3=[1,2,3,4,5];
 
 let finalValue= arr3.reduce((res,el)=>{
  return res+el;
 });

 console.log(finalValue);

 //p-Q  max in array 

 let value = [1,2,3,4,5];

 let maxVaule= value.reduce((max,ele)=>{ 
       if(max<ele){
return ele;
       }else{
        return max;
       }
 });
 console.log(maxVaule);

 //pq-1 cheak all in array mulitple of 10 

 let set = [10,20,30,3,50];

  let cheackMulti= set.every((el)=>{
      return el%10==0;
  });
  console.log(cheackMulti);
   
  //pq-2 create a function to find Min value 

  let min = set.reduce((min,el)=>{
    if(el>min){
      return min
    }else{
      return el;
    }
  });
  console.log(min);

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

 let{name, age,pass:secret,username:user}// pass search hoil ahhe ka object mde pass la appan secrect bolu shakto  and username la user  
