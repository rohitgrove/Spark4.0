async function wait3Sec() {
    console.log("waiting for 3 seconds...");
    await new Promise(resolve => setTimeout(resolve, 3000));
    console.log("Done waiting");
}

console.log("start waiting");
wait3Sec();
console.log("This will run while waiting...");