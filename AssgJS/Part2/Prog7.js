//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let str = prompt("Enter string: ");

function removeVowels(str){
    const vowels =['a','e','i','o','u'];
    let arr = str.toLowerCase().split('');
    for (const v of vowels) {
        if(arr.includes(v)){
            arr = arr.filter(x => x != v)
        }
        
    }
    
    return arr.join('');
}

console.log('Without vowels: ' + removeVowels(str));