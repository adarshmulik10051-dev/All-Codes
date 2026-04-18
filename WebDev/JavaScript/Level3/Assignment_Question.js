//Write a Java Script program to get the first n elements of an array.[n can be any positive number]
let  nums=[1,2,3,4,5,6,7,8,9];
let n = 3;
let value = nums.slice(0,n);
console.log(value);

//same but from last

let m = 3;
let values=nums.slice(nums.length-n);
console.log(values);

//3)3.Write a Java Script program to check whether a string is blank or not

let string="sd";
 if(string.length==0){
    console.log("String is empty");
 }else{
    console.log("string is not empty");
 }

 //Write a Java Scrpt program to test whether the character at the given (character) index is lowercase

 let str="abCbASddD";
 let s= 1;
 if(str[s]==str[s].toLowerCase()){
    console.log("yes its is lowercase");
 }else{
    console.log("is not lowercase");
 }