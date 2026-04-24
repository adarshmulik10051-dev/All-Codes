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