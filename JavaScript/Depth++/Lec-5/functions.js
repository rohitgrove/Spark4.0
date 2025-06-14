function welcome() {
  console.log("welcome to CSF");
}

welcome();

// function expression : function can be store in variable is called function expression

const wel = function () {
    console.log("welcome to java batch");
};

// how to call this method
wel();

// array function
// Note: ES6 shorter syntax hai
const sub = (a, b) => {
    return a - b;
};

console.log(sub(20, 10));

const sq = s => s*s;
console.log(sq(5));

// default parameter
function greet(name = "grover") {
    console.log("Hello " + name);
}
greet("rohit");
greet();
// Note: variable inside function can't be access outside
function showName() {
    let name = "Rohit Grover";
    console.log(name);
}

showName();


// callback functions
// note: pizza ready then call me
// Defination: A call back function is just a function that you can pass to another function.
function hello(name) {
    console.log(`Hello, ${name}! welcome to the coffe shop!`);
}

function getCustomerMsg(callback) {
    const name = "rohit";
    callback(name); // calling the passed function
}

getCustomerMsg(hello);