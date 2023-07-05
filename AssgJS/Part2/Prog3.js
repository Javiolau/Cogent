//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let str1 = prompt("Enter String: ");
let str2 =  prompt("Enter String 2: ");

function anagram(str1,str2){
    if(str1.length != str2.length) return false;

    const arr1 = str1.split(''); 
    const arr2 = str2.split('');
    return arr1.sort().join() == arr2.sort().join();
    
}

anagram(str1,str2) ? console.log('Its anagram') : console.log('Not an anagram');