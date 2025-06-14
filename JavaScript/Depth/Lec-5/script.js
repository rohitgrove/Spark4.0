var apnavar = document.querySelector('h1'); // selection
var div = document.querySelector('div');
const btn = document.getElementById('btn');
btn.textContent = "Starting...";
// css lagane ka phela way
// apnavar.style.color = 'red';
// apnavar.style.fontFamily = 'Courier New';
// css lagane ka dusra way
apnavar.classList.add('apna-css');
apnavar.classList.remove('apna-css');
// create element and delete element
var h1 = document.createElement('h1');
h1.innerHTML = "hello";
h1.classList.add("test");
document.querySelector("body").appendChild(h1);
document.querySelector("body").removeChild(btn);

var butn = document.querySelector('button');
butn.addEventListener('click', function () {
    console.log('click');
});