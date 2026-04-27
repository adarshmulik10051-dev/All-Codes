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