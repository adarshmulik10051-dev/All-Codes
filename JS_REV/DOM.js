//20.DOM:
//What is DOM:
// dom is the document object Model
// it allow to changes on web page content (html content)
//20.1 DOM Object :
console.dir(document);
//20.2 how to change html cod with DOM
document.all[8].innerHTML="hello there!";

//20.3 select Element  by id:
let heading = document.getElementById("heading");
console.log(heading);//show actual lin on html
console.dir(heading);//show all propertis 
//20.4 select element by class name:
let para = document.getElementsByClassName("para");
console.log(para);
para[0].innerHTML="mulik"//change kela
//20.5 select Element By Tag Name:
let heading2 =document.getElementsByTagName("h2");
console.log(heading2[0].innerHTML);

//20.5Query Selector:
//20.5.1 select element by id -->return first match only 
let p1 =document.querySelector('#para1');
console.dir(p1);
p1.textContent="easy";//change kela 
//20.5.2 select element by class:
let p2 = document.querySelector('.para2');
console.dir(p2);
//20.5.3 select all element which matches 
let h3all = document.querySelectorAll('.head');
console.dir(h3all);
h3all[0].innerHTML="change para";//all h3 madhla 1st gheun change 

//20.6 Manuplating content in java using DOM
//20.6.1 innerText:what you se on html page 
let x=document.querySelector('#manipulation');
console.dir(x.innerText);//og innertext
x.innerText="My Name is akash. Im 25 years old."//change on page see
//20.6.2 innerHtml: what you see in actual html code:
x.innerHTML = "Hello My name is adarsh. <i>this is italic text</i>";
//20.6.3 textContent:eturns all text including hidden text
console.log(x.textContent);





 


