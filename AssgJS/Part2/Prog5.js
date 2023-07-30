//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let char = prompt("Enter character: ");

function charOrVow(char){
    const vowels =['a','e','i','o','u'];
    
    if(vowels.includes(char.charAt(0).toLowerCase())) 
        return true;
    return false;
}

charOrVow(char) ? console.log('Its vowel') : console.log('Its consonant');