// let main redeclare nhi kar sacte
let shopName = "rohit grover";
let cutomeNum = 10;

console.log(shopName);
console.log(cutomeNum);

cutomeNum = 20; // reassignable
console.log(cutomeNum);

// const
// when you know value is not change then we will use const
// sb config, Address

const adr = "H.N 779, sector - 15, sonipat";
console.log(adr);

// adr = "H.N 779, sector - 15, chandighar"; // not reassignable
console.log(adr);

// var main redeclare kar sacte
var name = "Rohit";
name = "raj"; // nhi kar sacte reassign
console.log(name);

var name = "simran";
console.log(name);


// keywords               reassign            redeclare                 scope
// var                      yes                  yes                   function
// let                      yes                  No                     Block
// const                    No                   No                     Block

// what is scope?
// 1. global scope
// 2. function scope
// 3. Block scope

function demo() {
    var x = "this is var x";
    console.log(x);
}

demo();
// console.log(x);

{
    const z = "this is const z";
    let y = "this is const y";
    var k = "this is const k";
    console.log(z);
    console.log(y);
}
// interview question
// console.log(z);
// console.log(y);
console.log(k);
