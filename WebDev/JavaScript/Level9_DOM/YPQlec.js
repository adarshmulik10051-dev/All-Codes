//add para with red text 
let para1 = document.createElement('p');
para1.innerText="hey i'm red";
let body =document.querySelector('body')
body.append(para1);
para1.classList.add("red");

// add h3 with text 
let h3 = document.createElement('h3');
    h3.innerText="i a'm blue h3";
body.append(h3);
h3.classList.add("blue");

//
let div = document.createElement('div');
body.append(div);
let h1 = document.createElement('h1');
h1.innerText="i'm inside div";
div.prepend(h1);

let para2 = document.createElement('p');
para2.innerText="ME TOO";
div.appendChild(para2);


