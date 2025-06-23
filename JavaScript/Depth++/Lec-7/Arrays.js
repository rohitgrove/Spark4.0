// creating array
const colors = ["red", "green", "blue", "yellow", "purpole", "orange"];

const arr = [10, "arjun", true];

// access elememt
console.log(arr[0]);

// replace
arr[0] = 20;
console.log(arr[0]);

console.log(arr.length);

for (let index = 0; index < colors.length; index++) {
    console.log(colors[index]);
}

// for each
arr.forEach(element => {
    console.log(element);
});

for (const a of arr) {
    console.log(a);
}