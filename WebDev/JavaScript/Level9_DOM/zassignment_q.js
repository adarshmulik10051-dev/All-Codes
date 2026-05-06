//Qs1.Create a new input and button element on the page using JavaScript only. Set the text of button to “Clickme”
    let body = document.querySelector('body');
    let input = document.createElement('input');
    let btn1  = document.createElement('button');
        btn1.innerText="click_me!";
        body.append(btn1);    
        body.prepend(input);

  
//Qs2.Add following attributes to the element:
//      -Change placeholder value of input to “username” 
//      -Change the id of button to “btn   

    input.setAttribute('placeholder','Usename');
    btn1.setAttribute('id','btn1');


 //Qs3.Access the btn using the query  Selector and button id .Change  the button backgroundcolor to blue and text color  to  white.

    let btncss =document.querySelector('#btn1');
        btncss.style.backgroundColor='blue';
        btncss.style.color='white';

 //Qs4.Create an h1 element on the page and set its text to “DOMPractice” underlined. Change its color to purple
    
    let h1 = document.createElement('h1');
        h1.innerText="DOMPractice";
        body.append(h1);
        h1.style.textDecoration='blue underline';

// Qs5.Create a p tag on the page and set its text to “Apna College Delta Practice”, where Delta is bold.

    let p =document.createElement("p");
        p.innerHTML="ApnaCollege<b>Delta</b>Practice";
        body.append(p);

        
        