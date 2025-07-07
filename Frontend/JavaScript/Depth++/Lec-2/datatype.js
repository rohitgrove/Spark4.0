// primitive
let userName = "Rohit"; // String
let age = 28; // number
let flag = true; // boolean
let phone; // undefined
let car = null; // null
let bigNum = 121323n; // bigint
let uniquekey = Symbol("userID");

// non-p
let courses = ["35", "react", "Spring Boot", "java"];
// Car car = new Car(); in java
let users = {
    name : "Rohit",
    phone : 870567578
}; // object

function welcome() {
    return "hello";
}

console.log(typeof userName);
console.log(typeof phone);
console.log(typeof car);
console.log(typeof welcome);
console.log(typeof courses);
console.log(typeof "object");
console.log(typeof null);