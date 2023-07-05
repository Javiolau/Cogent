//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let str = prompt("Enter String: ");

function removeBlank(str) {
    return str.replaceAll(' ','');
}
console.log(removeBlank(str));