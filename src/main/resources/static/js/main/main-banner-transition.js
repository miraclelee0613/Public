const div = document.querySelector("div.banner");
const arrows = document.querySelectorAll("div.arrow");
const btns = document.querySelectorAll(".btn");
const firstDiv = document.createElement("div");
const lastDiv = document.createElement("div");
var count = 0;
var buttonCheck = true;
var numberButtonCheck = true;
var temp = btns[count];

firstDiv.innerHTML = `<img src="img/006.png">`;
div.insertBefore(firstDiv, document.querySelector("div.banner div"));

lastDiv.innerHTML = `<img src="img/001.png">`;
div.appendChild(lastDiv);

div.style.transform = "translate(-90vw)";

btns[0].style.background = "black";

let inter = setInterval(autoSlide, 2500);