function getUserData() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const data = { name: "Rohit", age: 16 };
            resolve(data);
        }, 2000);
    });
}

console.log("start fetching user data...");

getUserData()
    .then((data) => {
        console.log("User data fetched:", data);
    })
    .catch((error) => {
        console.log("Error fetching user data:", error);
    });