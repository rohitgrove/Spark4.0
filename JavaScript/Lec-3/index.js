// var a = 10;
// if (0) {
//     console.log("Hii");
// } else {
//     console.log("Hello");
// }

// for each loop
var arr = [1,2,3,4,5];
arr.forEach(data => {
    console.log(data);
});


function print(name) {
    console.log("Hello: " + name);
    return "Hello ji... ";
}
var res = print("Rohit Grover");
console.log(res);

var func = function() {
    console.log("bhow bhow....");
}
func();

var fun =(name) => {
    console.log("hello: " + name);
    return "Hello " + name + " ji aap kya kar rhe hai..."
}

var res = fun("Rohit");
console.log(res);
