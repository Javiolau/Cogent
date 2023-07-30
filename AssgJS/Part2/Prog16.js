//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let str = prompt("Enter String: ");

function sortAsc(srt){
    let arr = srt.split('').sort();
    return arr.join('');
}
console.log(sortAsc(str));