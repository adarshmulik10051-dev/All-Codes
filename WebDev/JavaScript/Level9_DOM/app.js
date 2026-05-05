// selcting element 

//1) getElementById("");

let description=document.getElementById("description");

console.log(description);
 let mainImg = document.getElementById("mainImg");
console.log( mainImg.src);//to get src
console.log( mainImg.id);//to access id
console.log( mainImg.tagName);
//mainImg.src="assets/creation_1.png";//also cahnge source 

// getElementByClassName("");

let smallImg =  document.getElementsByClassName("oldImg");
console.log(smallImg);//cheak o/p like array but not perform opertion like array you can access it like array
console.log(smallImg[0]);

for(let i = 0 ; i <smallImg.length ; i ++ ){
    console.dir(smallImg[i].src);
}

let tagNa =document.getElementsByTagName("p");
console.dir(tagNa);
 // tagNa[0].innerText="abc";


 //Query selector: document.querySelector('p')-->It similar like css selctore 'p','#myId',',class' 

let qs=document.querySelector('p b');
console.dir(qs);

//document.querySelectorAll('p')--> it can acees all p 

let all=document.querySelectorAll('div a');
console.dir(all);

// text &content base property
//1. innerText-->it just what display on page exact give

document.querySelector('p').innerText;
//you can easilt change vaule but it not recognize the markup launguage trat as text 


//2. innerHTML
// it will you full markup html code with all tags that not visible on web page text b u i etc.
    document.querySelector('p').innerHTML;

//3. textContent-->It will give vs code  line paces and next line 
document.querySelector('p').textContent;

// getAttribute('att');

let a = document.querySelector('a');
a.getAttribute('class');


let img = document.querySelector('img');

img.getAttribute('id');



//setAttribute('att' , 'value') ;  value= that yyou want to change add there 

let para = document.querySelector('p');
para.setAttribute('p','abcd');


// manuplate styl
// 1) using style property:

//element.style to see css property
let image = document.querySelector('.oldImg');
console.dir(image);
console.dir( img.style);

// acess and aplly style on the element,here we use camelCase not css style like hypens like 
//element.style.color=''; 

let heading = document.querySelector('h1');
heading.style.color='orange';// this style will run  on inly console not in file 


let links = document.querySelectorAll('.box a');

for(link of links){
    link.style.color='red';
}

//2) using classList property
 // it helps to add classe 

 let smallphoto =document.querySelector('.images');

console.dir( smallphoto.classList);

//functions 


//1) .classList.add(""); // to add class name in list 
    smallphoto.classList.add("imgg");

//2) .classList.remove(""); // to remove class name in list 
    smallphoto.classList.remove("imgg");

//3) .classList.contain(""); // ya adhi present ahhe ka   class name  
        smallphoto.classList.contains("imgg");

//4) .classList.toggle(""); // to add or remove class name  like pahila asel tr remove nasel tr add 
    smallphoto.classList.toggle("imgg");

// set style in  css class boxbg name now we simple add class then it is easilt aplly on this elemnt

let b = document.querySelector('.box');
b.classList.add("boxbg");


// navigation on page 

let di= document.querySelector('div');

//1).parentElemnt --> parent ellemt deto 
    di.parentElement;//print karava lagel 

//2).children-->to give child of acessed element
    di.children;

//3).chileElementCount--> return count of chile element
    di.childElementCount;

//4)previousElementSibling
  console.dir(  di.previousElementSibling);
//5)nextElementSibling   
console.dir(di.nextElementSibling); 
 // you can easily change syyle also

 // adding Elements 
//first create 
 let newp = document.createElement('p');
 newp.innerText="hii i am adarsh ";
 let box = document.querySelector('.box');

//element(inside).appendChild(elemnt who pass );
 box.appendChild(newp);

 //also we can create buttun 
 let btn = document.createElement('button');
 btn.innerText="click me";
 box.appendChild(btn);


 // only use append()--> tych element add honar 

 newp.append(" student of college of");//this text add into newp // btn sudha add kru shakto 

 //apend add to last 
 //prepend(element);
box.prepend(btn);

//insertAdajecentElement(where,element);
     let p = document.querySelector('p');
     let newbtn = document.createElement('button');
     newbtn.innerText="Submit";
//where--> beforebegin 
    p.insertAdjacentElement('beforeBegin',newbtn);
    p.insertAdjacentElement('afterBegin',newbtn);
    p.insertAdjacentElement('beforeend',newbtn);
    p.insertAdjacentElement('afterend',newbtn);






