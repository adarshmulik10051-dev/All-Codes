// arrays
  let name= ["adaarsh","sarthak","harsh","dikshant","rohit"];
  console.log(name);
  //types to creat array
   let marks=[10,20,30,40];// integer type array
   let students=["adaarsh","sarthak","harsh","dikshant","rohit"]; // string type array
   let info=["adarsh",3.5,25]//mix type array

   //arrays are mutable
   let fruits=["apple","Mango","orange","chikuu"];
   console.log(fruits);
   fruits[0]="banana";//after chanege the 0 th idx of array
    console.log(fruits);
    //you can add any no of array that not present in array
    fruits[10]="coconut";


//arrays methods
//push pop unshift shift 

let cars=["maruti","xuv","audi","BMW"];

//.push()TO add at end of array 
cars.push("swift");
console.log("after use push",cars);

//.pop() to delete from end 
cars.pop();
console.log("after use pop",cars);

//.unshift()-->used for add start element in array

cars.unshift("toyota");
console.log("after use unshift ",cars);

// .shift()-->used for delete from start
 cars.shift();
 console.log("after use shift ",cars);

 //retrun it exaple using shift i work like delete from start and return it

 let followers= ["a","b","c","d"];
 let blocked= followers.shift();
 console.log(blocked);

 //.indexOf("....")--> used find the index of element that present in the array

let primary=["orange","red","green"];
let idx= primary.indexOf("green");
console.log(idx);

//includes --> is used to present or not in array retrun true false

let present=cars.includes("xuv");
console.log(present);

// .concate();--.used two mearge two arrays
let num1=["1","2","3","4"];
let num2=["5","6","7"];
let num3= num1.concat(num2);
console.log(num3);

//reverse();--. used to revese
console.log(num1.reverse());

//slice() function

cars.slice(1,4);//give 1 to 3 
cars.slice(3);// give 3 to cars.length
cars.slice(-2);//give length-2 last wale 2 denar
cars.slice();// sagla array denar 

//splice()--> remove/replace/add elemet in space

let girls=["sneha","diksha","gaytri","pratiksha"];

girls.splice(3);//it act like slice 3 -end all delete
console.log(girls);
girls.splice(0,1);//it 0 se start karro 1 elemet delet karna hai
console.log(girls);
girls.push("sneha");
girls.push("pratiksha");
console.log(girls);
girls.splice(1,2,"sayli");//1 no la remove kela anii 2 la repce kela with sayli
console.log(girls);

// .sort()method

cars.sort();
console.log(cars);
console.log(girls);

//PQ
let months=["jan","jul","march","aug"]

months.splice(0,2,"july","june");
console.log(months);

//2)return index when it revese

let lang=["c","c++","html","javascript","python","java","c#","sql"];
lang.reverse();
console.log(lang);
console.log(lang.indexOf("javascript"));