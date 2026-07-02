//📌1.DOM:(document objet model)

         /*1. what is DOM:
            DOM (Document Object Model) is a tree-like representation of an HTML document created by the browser.
                It allows JavaScript to access, modify, add, and remove HTML elements dynamically without reloading the page 

         1.1 IT allow:
         -Read-modify-add-remove HTML element/content 
         - respond to user action 

         1.2 DOM is used for:
         -Login Forms,Shopping Cart,Navigation Menu,Chat Application
         */
            
         //2. selecting Atrributes:
        
         //1.getElementById():
         //select element using their uniqe id 
         //return only one element 
         let heading = document.getElementById("title");
           console.log(heading);

//📌2.getElementByClassName():
     //-select all elemnet that having same class. 
     let boxes = document.getElementsByClassName("box");
     console.log(boxes[0]);
     console.log(boxes[1]);

     // 3.getElementByTagName():
     //-select element using tag name ret all
        
     let headings =document.getElementsByTagName("h2");
     console.log(headings[0]);
     console.log(headings[1]);

     //4.QuerySelector:
     // it can return first matching element
     let byId = document.querySelector("#qeury");//by id
     console.log(byId);
     let byclass= document.querySelector(".qeury1");//by class
     console.log(byclass);
     let byTag= document.querySelector("b");
     console.log(byTag);

     //5,querySelectorAll():
     //return all matching element

     let boxess =document.querySelectorAll(".box123");
     /*console.log(boxess[0]);
     console.log(boxess[1]);
     console.log(boxess[2]);*///inssted of
     boxess.forEach(box=>{
        console.log(box);
     });

//📌3.DOM- Setting content:
     //js can change  the content og html element using diff properties
     //innerHTML ,innerText,textContent

     //3.1innerHtml:(innerHTML = HTML pan samjto.)
     //used to get and set content inside the element 
     let head= document.getElementById("title");
     console.log(head.innerHTML); //to get
     head.innerHTML="<i>Welcome</i>";//to set
     console.log(head.innerHTML); //welcome

     //3.2innerText:(user la disel te)
     //used to get set  only visible text
     let head2= document.getElementById("innertext");
     console.log(head2.innerText);
     head2.innerText="<i>Welcome</i>";//change on webpage 

     //3.TextContent:
     //Used to get or set all text, even hidden text.
     const text = document.getElementById("msg");
     console.log(text.textContent);
    /*innerHTML → HTML code sobat kam karto.
      innerText → Screen var je disat te.
      textContent → Element madhla sagla text, hidden suddha. */
    
//📌/4.DOM - Manipulating Attributes:
     // atrributes mean give extra information about html element  
     // Works with any HTML attribute (src, href, class, id, title, etc.).
     //js can get set remove attributes with method 

     //4.1 getAttribute():
     //used to get value of the attributes

     const image = document.getElementById("img");
     console.log(image.getAttribute("id"));
     console.log(image.getAttribute("src"));
     console.log(image.getAttribute("alt"));

     //4.2 SetAttribute:
     //used to add new or update exiting  attribute  of element;

     const image1 = document.querySelector(".img2");
     image1.setAttribute("id","img1");//set kela
     image1.setAttribute("alt","john");//setkela

     console.log(image1.getAttribute("id")); //img1
     console.log(image1.getAttribute("alt"));//john

     //4.3 removeAttributs():
      image1.removeAttribute("alt");
      console.log(image1.getAttribute("alt"));//null

//📌5.DOM - Style Manipulation
     // js can change css style of html element using the style property.
     //5.1 syntax:
     // Element.style.property="value"
     // h1.color="red"
     let p1 = document.querySelector("#style");
     let div= document.querySelector(".style");
     p1.style.color="red";
     p1.style.fontSize="40px";

     /*CSS	:background-color 
      JS    :backgroundColor 
      js :cameCase
      css:kebak-case
     */

//📌6.DOM - classList (methods)
     //html element mde class add(), remove() , contain(), toggle(), replace() 
     // karto ha mg appan adhich .red mnun css la file add karun thevaychi
     // jya element la ti style gheychi ahhe tila .classlistAdd() karaych;
     
     let div1=document.querySelector(".classList");
     let p3= document.querySelector(".classList");
     console.log( div1.classList);
     console.log(p1.classList);
     //1.1 classList.add():
     div1.classList.add("divBorder");
     div1.classList.add("BR");
     p3.classList.add("bkc");

     //2.2 classList.remove():
     div1.classList.remove("divBorder");

     //3.3. classList.toggle()
     //Adds the class if it doesn't exist, otherwise removes it.
     div1.classList.toggle("BR");

     //4.4. classList.contains()
     div1.classList.contains("divBorder");// ptint krla tr true/flase

     //5.5 classList.replace()
      div1.classList.add("BR","bkc");
//📌7.DOM - Navigation:
     //dom navigation is used to move between parent -chil-sibling element
     
     //7.1 parentElement:Returns the parent element.
     const title = document.querySelector(".h1");
     console.log(title.parentElement);

     //7.2 children: Returns all child elements.
     const parent = document.getElementById("parent");
     console.log(parent.children);

     //7.3firstElementChild: Returns the first c.hild
     console.log(parent.firstElementChild);

     //7.4lastElementChild: Returns the last child.
     console.log(parent.lastElementChild);

     //7.5nextElementSibling: Returns the next sibling.
     console.log(title.nextElementSibling);

     //7.6.previousElementSibling: Returns the previous sibling.
     console.log(title.previousElementSibling);
      
     
     





























