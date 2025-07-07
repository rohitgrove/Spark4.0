let fullName = "  rOHit GroVeR  ";

fullName = fullName.trim();

console.log(fullName);

let nameSplit = fullName.toLowerCase().trim(/\s+/);
console.log(nameSplit);

function toTitleCase(s) {
    return s[0].toUpperCase() + s.slice(1);
}

let fname = toTitleCase(nameSplit[0]);
let lname = toTitleCase(nameSplit[1]);

console.log(fname);
console.log(lname);
