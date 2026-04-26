//qs1.Square and sum the array elements using the arrow function and then find the average of the array

let array = [1,2,3,4,5];
 let squrearr=array.map((el)=>{
    return el*el;
 });
 let sum = squrearr.reduce((sum,el)=>sum+el);
 let avg = sum/array.length; 
 console.log(avg);

//Qs2.Create a new array using the map function whose each element is equal to the original element plus 5

let plus5=array.map((el)=>{
    return el+5;
})
for(el of plus5){
    console.log(el);
}

//Qs3.Create a new array whose elements are in uppercase of words present in the original array

let names= ["adarsh","sarthak","harsh","dk","rohit","shera"];

let upperNmaes=names.map((el)=>{
    return el.toUpperCase();
});

//

const cars ={
    name:"bmw",
    no:2020,
    color:"red"
}
const bike={
    name:"shine",
    no:2020
};

function veichals(cars,bike){
    

}


