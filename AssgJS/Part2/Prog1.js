//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let str = prompt("Enter String: ")
let char =  prompt("Enter letter to replace: ")

let str1 = str.replaceAll(char,'');
console.log(str1);
