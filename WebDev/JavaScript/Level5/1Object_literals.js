//Object_literals : is a collection of properties and properties contain key's and value pair

const student = {
    name:"adarsh",
    age:21,
    marks:91
};

const item = {
    price:100,
    discount:50,
    colors:["red","blue"]
};

const post= {
    userName:"@adarsh_12",
    content:"manali trip post",
    like:257,
    repost:1,
    tags:["@adarsh_12","@travelustad","@w3b.harsh"]
};

//Get values-->how to get values from object

//objectname["key"];
//objectname.key;

//add and update value

const student1 = {
    name:"Adarsh",
    age:21,
    city:"mumbai",
    marks:91
}
// objname.key="newvalue";-->to change value
//objename.newkey="value";-->to add new key in obj
// delete object.keyname;

//nested object or object of object

const classInfo = {
    adarsh:{
        
        grade:"A+",
        city:"sangli"
    },
    sarthak:{
        grade:"A+",
        city:"satara"
    },
    harsh:{
        grade:"A+",
        city:"sangli"
    },
    dikshant:{
        grade:"A+",
        city:"borli"
    }
};

//array of obejects

const dada = [
    {
        name:"adarsh",
         grade:"A+",
        city:"sangli"
    },
    {
        name:"sarthak",
         grade:"A+",
        city:"satara"
    },
    {
        name:"harsh",
         grade:"A+",
        city:"sangli"

    },
    {
        name:"dikshant",
         grade:"A+",
        city:"borli"
    }
];

//nto get random integrs
let s = Math.floor(Math.random()*10)+1;
console.log(s);