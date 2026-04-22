// Qs1.Write a JavaScript function that returns array elements larger than a number

function greaterThanNum(num,array){
    for(let i = 0 ; i <array.length; i++ ){
        if(array[i]>num){
            console.log(array[i]);
        }
    }
}
let num = 5;
let array =[1,2,3,4,5,6,7,8,9];
greaterThanNum(5,array);

// Qs2.Write a Java Script function to extract unique characters from a string

let str ="apanacollege";

function uniqueChar(str){   
    let newStr="";

    for(let i = 0 ; i < str.length; i++){

        let currChar=str[i];

    if(newStr.indexOf(currChar)==-1){

        newStr +=currChar;
    }

    }
     return newStr;
}
let newStr=uniqueChar(str);
console.log(newStr);
//
//s3.Write a JavaScript function that accepts a list of country names as input and returns the longest country name as output


let country = ["Australia","Germany","United States of America"];

function longestCountryName(country){

    let maxLength=0;
    let ans = "";


    for(let i = 1 ; i < country.length ; i ++){
        let currStr=country[i];
        if(maxLength<currStr.length){
            maxLength=currStr.length;
            ans = currStr;
        }
    }
    return ans ;
}

let ans=longestCountryName(country);
console.log(ans);

//4.Write a Java Script function to count the number of vowels in a String argument


let str2 = "aeiou ";

function cntOvels(str2){
    let cnt = 1 ;
    for(let i = 0 ; i < str2.length; i++){
        if(str2[i]=='a' || str2[i]=='e' || str2[i]=='i'|| str2[i]=='o' || str2[i]=='o'){
            cnt++;
        }
    }
    return cnt ;
}
let cnt =cntOvels(str2);
console.log(cnt);