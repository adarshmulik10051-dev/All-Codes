// loops
//for loop--.it used for do same work repeatively

for(let i = 1; i <= 5; i ++){
    console.log(i);
}

//revers loop
for(let j = 5; j>=1 ; j--){
    console.log(j);
}

//print odd no 1-15
for(let i = 1 ; i<=15; i=i+2){
    console.log(i);
}
//print even no 1-15
for(let i = 2 ; i <= 15 ; i=i+2){
    console.log(i);
}
//prit table of 5

//let n= prompt("which table you want:");
let n= 4;
n=parseInt(n);
for (let i = 1 ; i<=10;i++){
     console.log(n*i);
}

//Nested loop

for(let i = 0 ; i<=3 ;  i ++){
    for(let j = 0 ; j <= 3 ; j ++){
       console.log(j);
    }
}

//while loop

let i = 1 ; 
while(i<=5){
    console.log(i);
    i++;
}

// fav movies guess

const favMovie="avtar";
let guess=prompt("enter a movie name for guess!!");

while((guess!=favMovie) && (guess!="quit")){
   
  guess=prompt(" wrong guess enter a movie name for guess!!");
}
if(guess=="quit"){
   console.log(`hehe you lost the movie name is:${favMovie}`);
}else{
    console.log("you won ,guess the correct movie");
}

// break statement
for(let i = 1 ; i <=5;i++){
    if(i == 3){
        break;
    }
    console.log(i);
}

//loops with array's

let fruits=["orange","mango","lichi","papaya","apple"];

    for(let i = 0 ; i < fruits.length; i++){
        console.log(i ,fruits[i]);
    }

    //loop with nested array

    let heroes = [["sher shivray","chava sambhaji","hanuman da","ganu bappa"],
                  ["rohit sharma","surya","bhumrah","hardik"]
                ];

    for(let i = 0 ; i < heroes.length; i ++){
        for(let j= 0 ; j < heroes[0].length; j++){
            console.log(heroes[i][j]);
        }
    }

// for of loop- it an iterate the each element in the array and string also 
//array
let names =["adaarsh","sarthak","harsh","dikshant"];
for(friends of names){
    console.log(friends);
}
//string
let str="adarsh mulik";
for(char of str){
    console.log(char);
}

// nested for of loop--. hite bg pahila 2d array travese kela mg row row bhetla ata row travesr kela 
for(list of heroes){
   for(hero of list){
     console.log(list);
   }
}