//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let str = prompt("Enter String: ");

function sortDesc(srt){
    let arr = srt.split('').sort();
    return arr.reverse().join('');
}
console.log(sortDesc(str));