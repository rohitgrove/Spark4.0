// shoping cart

// initilzation empty array
let cart = [];

// add item
cart.push("T-shirt");
cart.push("shoes");
cart.push("watch");

console.log("cart item : ", cart);

// removing item
let popItem = cart.pop(); // remove value from last
console.log("Pop item", popItem);
console.log("cart item", cart);

// h.w for
console.log("your carts is: ");
cart.forEach((item, index) => {
    console.log(`${index + 1}. ${item}`);
});

// check if shoes if there
if (cart.includes("shoes")) {
    console.log("ha bhai bechte hai");
} else {
    console.log("na bhai");
}

// remove by name
function remove(itemName) {
    cart = cart.filter(cart => cart !== itemName);
}

remove("shoes");
console.log(cart);
