//Qs1.Create a program that generates a random number representing a dice roll.
//  [The number should be between 1 and 6].

let dice=Math.floor(Math.random()*6)+1;
console.log(dice);

//Create an object representing a car that stores the following properties for the
//  car:name,model, color .Print the car’s name.

const cars = {
    name:"swift",
    model:"xuv",
    color:"red"
}
console.log(cars.name);

//3.Create an object Person with their name,age and city .Edit their city’s original value to change it to “NewYork”. 
// Add a new property country and set it to the UnitedStates

const person ={
    name:"shera",
    age:21,
    city:"pune"
};
console.log("origanal city",person.city);
console.log("changed city:",person.city="wategoan");