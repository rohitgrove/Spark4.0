const student = {
    name: "Rohit",
    age: 16,
    course:"Java"
}

// Dot notaton
console.log(student.name);

// bracket notation
console.log(student["age"]);


// adding / updating / delete

student.name = "Raj"; // update
student.add = "Agra"; // add
console.log(student);

delete student.add;
console.log(student);

// Nested Object
const user = {
    name: "Raj",
    address: {
        city: "agra",
        state: "UP"
    }
}

console.log(user.address.city);


// object Method(function inside method)
const counter = {
    count: 0,
    increment: function() {
        const log = () => {
            console.log("Current count: " + this.count);
        };

        this.count++;
        log();
    }
};

counter.increment(); // Output: Current count: 1


const obj = {
    name: "Karan",
    age: 16,
    course:"Java"
};

for (let key in obj) {
    console.log(`${key} : ${obj[key]}`);
}

Object.keys(obj).forEach(key=> {
    console.log(`${key} : ${obj[key]}`);
});

Object.values(obj).forEach((v)=> {
    console.log(v);
})