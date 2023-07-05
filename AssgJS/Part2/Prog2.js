//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let str = prompt("Enter String: ")
let char =  prompt("Enter letter to count: ")

function countChar(str,char){
   
    const aStr = str.split('');
    const count=aStr.filter(x => x==char);
    return count.length;
}

console.log('Character count: ' + countChar(str,char));