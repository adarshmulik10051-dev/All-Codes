/* 📍 1.js call stack:
    -defination:
            -call stack is a data structure thatstore function calls and manage function execution

   - flow :LIFO
     function one(){
        two();
     }
     function two(){
      three();
     }
      function three(){
      console.log("hello ");
      }
      one();
      stack-->
             -------------
            console.log()
            -------------
            three()
            -------------
            two()
            -------------
            one()
            -------------
    📍2. stack overflow:
    infinite recursive call due to fill stack 
    
    ex-->
    function hello(){
        hello();    
    }
        hello();
    📍3.breakPoint:
      stop the prograam at specific time 

      why use :
      debugging (main)
      variable value check
      call stack 
      process:--> source --> slect line then  start up - next  like 

    📍4.JS is Single Threaded:
        JS can handel 1 work at a time ; no multiple works at time

        ex: we hava 3 task Together
        Task 1 exicute finish then next
        Task 2 ex finish then next
        Task 3

           // 3.JS Single Threaded:
            // console.log("1"); // line1 execute, move to line2
            // console.log("2"); // line2 executed, move to line3

            // setTimeout(() => {  // line executed
            //     console.log("buddy");
            // }, 1000)
            // console.log("hello"); // end of execution

            // but hello prints first and buddy print after how?
            // this is called asynchronous JS
            // setTimeout fnx is executed by browser not JS itself. browser has its own call stack
            // it holds the "buddy" for 2 sec and then returns it to JS


     📍5.callback hell:
      when multiple function call  again and agian then we use call back
*//*
     function placeOrder(callback){
        console.log("order placed");
        callback();
        
     }
     function preparefood(callback){
        console.log("prepare food ");
        callback();
       
     }
     function FoodServed(callback){
      
        console.log("Food Served");
        callback();
          
     }
     function paybill(callback){
    
        console.log("bill paid");
        callback();
           
     }
       
     placeOrder(()=>{
        preparefood(()=>{
            FoodServed(()=>{
                paybill();
            });
        });
     });*/

//this call call back hell

/*//📍4.1 suppose which get data and store in db and define save or not save base on internet spped

function saveToDB(data, success, failure) {
    let internet_speed = Math.floor(Math.random() * 10) + 1;
    if (internet_speed > 4) {
        success();
    }
    else {
        failure();
    }
}
//📍4.2 calling the function when first data saved then save second data only 
//saveToDB("hello",()=>,()=>)  callback function dile bg 

saveToDB("hello", 
    () => {
    console.log("success")
}, () => {
    console.log("fail");
})

//📍4.3  calling th function when first data save then gain second data save 

saveToDB("adarsh", 
    () => {
    console.log("data 1 saved");
    saveToDB("mulik", 
        () => {
        console.log("data 2 is added");
    })
}, () => {
    console.log("failed");
})
//this is fallback hell
*/

//📍5.promises:
//same thing with the  promise object :promise always return the pass , fail

/*function saveToDB(data) {
    return new Promise((resolve, reject) => {//this willl return promise now 
        let internet_speed = Math.floor(Math.random() * 10) + 1;
        if (internet_speed > 4) {
            resolve("success:data . ");
        }
        else {
            reject("error:weak conneaction");
        }

    })
}
let req = saveToDB("adarsh");
console.log(req);*/
/*
    //📍6. .then() .catch( ) method
        saveToDB("Adarsh Mulik")
        .then(()=>{
            console.log ("saved");
        })
        .catch(()=>{
            console.log("weak connection");
        })
*/
// promises chaining : when we need to call function again only if data saves :

/* saveToDB("adarsh")
.then(()=>{
    console.log("data saved ");
    return saveToDB("hello world");
 
})
.then(()=>{
    console.log("data 2 saved ");
}) 
 
.catch(()=>{
    console.log("weak connection ");
})*/

//chapter 2 : 
//async JS &API
/*1.async  function 
-they can alway return promises
it allow to write code asycronus look like syncronus
we can use  .then &.catchmethod on function   */

/* async function greet() {
     return "hello";//return promise 
 }
 greet()
     .then((result) => {
         console.log("data recived");
         console.log(result)
     })
     .catch((error)=>{
         console.log(error);
     })*/

//2. await function :
//it can wait for asnc first work done then next work
/*
function getNum(delay) {
   return new Promise ((resolve,reject) =>{
       setTimeout(() => {
       let num = Math.floor(Math.random() * 10) + 1;
       if(num<7){
           reject("no is <7");
       }
       console.log("the number is:", num);
       resolve(num);
   }, delay);
   }
)
}
    async function demo(){
      try{
        await getNum(1000);
       await getNum(1000);
       await getNum(1000);
       await getNum(1000);
       await getNum(1000);
      }catch(err){
       console.log(err);
      }
    }
    demo();// try eeror che adhi jr reun kela promise reject zala tr pudch ky run nhii hot 
    let a=5 ;
    let squre = a*a;
    console.log(squre);
*/

// rejection handling :
// promise reject zala ki pudch kych run nhi hot mg try & catch method varuya   

/*1. API :(aplication program interfernce )
     def : api is the messanger that allow differnt apppliction /to communicate &exchange data

      simple:API mhanje don applications madhla madhyasthi (messenger/waiter) jo data eka application
       kadun dusrya application paryant pohachavto.

       API Endpoint
       Endpoint = API cha specific URL jithun data milto.

*/

//res.json : parse the data/facts

/* let url ="https://catfact.ninja/fact";
 fetch(url)
 .then((res)=>{
     return res.json;
 })
 .then((data)=>{
     console.log ("data1:",data.fact);
     return fetch(url);
 })
 .then((res)=>{
     return res.json;
 })
 .then((data2=>{
     console.log("data2:",data2.fact)
 }))
 .catch((err)=>{
     console.log("ERROR:",err);
 })*/

/*let url = "https://catfact.ninja/fact";
async function getFact() {
    try {
        let res = await fetch(url);
        let data = await res.json();
        console.log(data.fact);

    }
    catch (err) {
        console.log(err);
    }
}
getFact();*/

// axios :it use internally fetch but it impproved labrary
//labrary used to make HTTP rqts
//add CDN link in html file then use

//why :
//do not need to pasrs data

/*
let url = "https://catfact.ninja/fact";

let btn = document.getElementById("fact");
btn.addEventListener("click",async ()=>{
   let fact= await getFact();
});

async function getFact(){
    try {
        let  res = await axios.get(url);
        let p= document.getElementById("result");
        console.log(res.data.fact);
        p.innerText=res.data.fact;   
    } catch (err) {
        console.log("ERROR:",err);
        
    }

}*/

//get request with new header:
let url = "https://catfact.ninja/fact";
async function getFact() {
    try {
        const config = { Headers: { Accept: "Applicationjson/" } };

        let res = await axios.get(url);
        console.log(res.data.fact);
    } catch (error) {
        console.log(error);
        
    }
}




