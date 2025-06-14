const age = 19;
if (age > 18) {
    console.log("you are allowed to watch");
} else if (age > 60) {
    console.log("you are not allowed to watch");
} else {
    console.log("you are kid not allowed");
}

const day = "Monday";
switch (day) {
    case "Monday":
        console.log("Monday office day");
        break;
    case "Friday":
        console.log("Friday daau day");
        break;
    default:
        console.log("normal day");
}

// loop
for (let index = 1; index < 5; index++) {
    console.log("Hello buddy");
}

// while
let i = 1;
while (i <= 5) {
    console.log("Hello buddy " + i);
    i++;
}

// break: loop se bhar le aata hai based on condition
// continue: loop se skip kar deta hai based on condition
// return: works with method to give return value or return method