//1).Write a JS program to delete all occurrences of element ‘num’ in a given array
let array = [1,1,2,2,3,3,4,4,5,5,6];
let num = 3;

while(array.includes(num)){
    let idx=array.indexOf(num);
    array.splice(idx,1);
}
for(element of array){
    console.log(element);
}

//2)Qs2.Write a JS program to find the no of digits in a number.
// Example:if number=287152,count=6

let number = 287152;
let count=0;
let copy=number;
while(copy>0){
    count++;
    copy=Math.floor(copy/10);
}
console.log("the digit of number is ",count);

//Qs3.Write a JS program to find the sum of digits in a number

let no = 287152;
let lastDigit=0;
let sum=0;
let temp = no;

while(no>0){
    lastDigit=no%10;
    sum+=lastDigit;
    no=Math.floor(no/10);
}
console.log(`number of${temp}sum of digit is${sum}`);

//Print the factorial of a number n

let n = 4;
let fact=1;
 for(let i = n ; i>0; i--){
        fact = fact*i;
 }
 console.log(`factorial of:${n} is ${fact}`);

 //Qs5.Find the largest number in an array with only positive numbers
 let nums=[2,3,4,6,8,10];
 let max=0;

 for(let i = 0 ; i < nums.length;i++){
    if(nums[i]>max){
        max=nums[i];
    }
  
 }
   console.log("laargest no in array is :",max);
