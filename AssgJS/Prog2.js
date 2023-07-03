//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let num = prompt("Enter Number: ")
let temp = num;
let digits = 0;
let rev = '';
//=====get digits=================
while(temp > 0){
    temp  = Math.floor(temp/10);
    digits++;
}
//=======reverse number============
temp=num;
for (let i = 0; i < digits; i++) {
    let ld =temp%10;
    temp  = Math.floor(temp/10);
    rev += ld;
}

rev == num ? console.log(num +" is a palindrome") : console.log(num + ' is not a palindrome');