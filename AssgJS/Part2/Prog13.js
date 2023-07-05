//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let str = prompt("Enter String: ");

function removeRepeated(str){
    let temp='';
    for (let i = 0; i < str.length; i++) {
        if(!temp.includes(str.charAt(i)))temp += str.charAt(i);
        
    }
    return temp;
}
console.log(removeRepeated(str));