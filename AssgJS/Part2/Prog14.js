//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let str = prompt("Enter String: ");

function sumInt(str) {
    let sum =0;
    for (const i of str) {
        if(!isNaN(i))sum+=Number.parseInt(i);
    }
    return sum;
}

console.log(sumInt(str));