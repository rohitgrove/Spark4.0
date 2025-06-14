// var arr = [1, "rohit", [], function () {}];
// console.log(arr[3]);

// objects
// var obj = {
//     func : function() {
//         console.log(this); // this.age
//     },
//     name: "rohit",
//     age: "25",
//     email: "groverrohit54@gmail.com",
//     contact: "87914551478"
// }

// console.log(obj.contact);
// console.log(obj.age);
// obj.func();
// console.log(this);

// counstructor
// function print() {
//     console.log(this);
// }

// var obj = new print();
// console.log(obj);

// iske andar this usi ko point karta jiske upper laga hua hai.
// document.querySelector("button")
// .addEventListener("click", function () {
//     console.log(this);
// });

// var obj = {
//     name: "Rohit",
// };

// function print() {
//     console.log(this.name);
// }

// print.call(obj);

// var func = print.bind(obj);
// func();

// closures

function print() {
    var p = 10;
    return function child() {
        console.log(p);
    }
}

var fun = print();
fun();