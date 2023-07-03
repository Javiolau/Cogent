//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let num = prompt("Enter Number: ")
let temp = num;
let rev =0;

while (temp>0) {
    rev = (rev*10) + (temp%10);
    temp= Math.floor(temp/10);
}

console.log('Reversed: ' + rev);