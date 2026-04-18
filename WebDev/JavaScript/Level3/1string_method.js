// Strings methods 
   // 1) trim method str.trim();  it can remove whitespaces from start and end and give new string
let msg = "     adarsh   ";
console.log(msg);
let tv=msg.trim();
console.log(tv);

  //2)touppercase AND tolowercase

let name= "Adarsh";
console.log(name.toUpperCase());
console.log(name.toLowerCase());  

    //3) String method with arguments
      // .idexOf(""); it can give you 1st occurence in the string

let str = "i love coding";
let index=str.indexOf("love");
console.log(index);

let str1="my name is adarsh";
let idx= str1.indexOf("adarsh");
console.log(idx);

    //4) method chaining --> it can perform 2 or more method at a time
    let str2="   message  ";
    let newstr2=str2.trim().toUpperCase();
    console.log(newstr2);

    //5)Slice method--> it can give new string from si to ei part of a string

    let str3= "apna college";
    console.log(str3.slice(0,4)); 
    
     let str4= "apna college";
    console.log(str3.slice(-2));// -ve will be sub from total length see -2 will 11-2=9

    //6) replace and repeat method

    let str6="I love coding";
    console.log(str6.replace("love","do"));

    console.log(str6.repeat(3));

    //7)Practice question
    