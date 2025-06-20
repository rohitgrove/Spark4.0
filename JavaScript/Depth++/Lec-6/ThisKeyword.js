const person = {
    name: "Aman",
    welcome() {
        console.log(`hello I am ${this.name}`);
    }
}
person.welcome();
// Note : this means current object