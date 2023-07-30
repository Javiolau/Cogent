//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let str = prompt("Enter String: ");

function repalceFirstVow(str){
    const vowels =['a','e','i','o','u'];
    
    for (const v of vowels) {
        if(str.includes(v)){
            return str.replace(v,'-');
            
        }
    }
    
    return str;
}
console.log(repalceFirstVow(str));