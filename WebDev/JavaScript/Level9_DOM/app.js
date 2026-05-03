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

let img = document.querySelector('img');

img.getAttribute('id');

//setAttribute('att' , 'value') ;  value= that yyou want to change add there 

let para = document.querySelector('p');
para.setAttribute('p','abcd');


// manuplate style using style property

let image = document.querySelector('.oldImg');
console.dir(image);
console.dir( img.style);

let links = Document.querySelector('.box a ');

 for(link of links ){
    link.style.color="purple";
 }

 let name = {
    names:"adarsh",
    age :12,
 }
 console.log(name.names);