// these --> is used to in objet you can make method and objects properys value assign or used then use this

const students = {//objetc
     name:"adarsh",
     eng:23,
     eng:55,
     maths:89,
     chem:87,
    
     getavg(){//method
        let avg =(this.eng+this.maths+this.chem)/3;
        console.log(avg);
     }
}

students.getavg();

//try &catch

console.log("hello 1");
console.log("hello 1");

try {
    console.log(a);
} catch(err){
    console.log("a is not defined");
    console.log(err);// these also print he error
}
console.log("hello 2");
console.log("hello 2");

//arrow function  =>

let sum = (a,b)=>{
    console.log(a+b);
}

let pow = (a,b)=>{
    return a**b;
}

let cube = (n)=>{
    return n*n*n;
}

// you can call same type sum(2,3);
sum(2,3); 

//you can store value of function also

let c =cube(3);
console.log(c);
//implicite arrow function 

const mul = (a,b)=>(
    a*b // this value retrun automatically do not to need the type return but note: the curly not uses rounded parathesis heild
)
let m = mul(2,3);
console.log(m);

//set time out function
console.log("hi there");
setTimeout(() => {
    console.log("apna college");
},4000);
console.log("welcome to");
//setInterval function

setInterval(()=>{
    console.log("heyyy!!");
},2000);
//how to stop it 

let id = setInterval(()=>{
    console.log("adarsh");

},3000);
clearInterval(id);   // to stop the setInterval time function
//pq wite a ariow function for square of the no
const squ = (n)=>n*n;
let s = squ(3);
console.log(s);

//print a hello world after 5 times at intervel 2 sec 

let id3 = setInterval(()=>{
    console.log("Hello World!!");
},2000);

setTimeout(()=>{
    clearInterval(id3);
},10000);
