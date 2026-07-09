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
      
      function saveToDB(data){
             return new Promise ((resolve,reject)=>{//this willl return promise now 
                 let internet_speed = Math.floor(Math.random() * 10) + 1;
                    if (internet_speed > 4) {
                        resolve("success:data . ");
                    }
                    else {
                        reject("error:weak conneaction");
                    }

             })
      }
      let req =saveToDB("adarsh");
      console.log(req);

