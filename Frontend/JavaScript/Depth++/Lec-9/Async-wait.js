async function demo() {
    // return "hello world";
    return new Promise.resolve("hello world");
}

console.log("start");
demo();
console.log("end");
