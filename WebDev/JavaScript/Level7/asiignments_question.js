//q1Write an arrow function named arrayAverage that accepts a narray of numbers and returns the average of those numbers.

let array =[ 89,99,100];

const arrayAvg= (array) =>{
    let totalSum=0;

    for(let i = 0 ; i < array.length ; i++){
        totalSum+= array[i];
    }
    let avg = totalSum/array.length;
    return avg;
}

let avgs=arrayAvg(array);
console.log(avgs);

//q-2 Qs2.Write an arrow function named isEven() that takes a single number as argument and returns if it is even or not

let n = 5 ; 
 const isEven=(n)=>{
    if(n%2==0){
        return "is even";
    }else{
        return "is not even"
    }
 }
 let evenOrnot =isEven(n);
 console.log(evenOrnot);