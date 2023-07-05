//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let str = prompt("Enter String: ");

function countVow_Con(str){
    let vowel = 0;
    let consonant =0;
    const vowels =['a','e','i','o','u'];
    
    for (let i = 0; i < str.length; i++) {
        if(vowels.includes(str.toLowerCase().charAt(i))) 
            vowel++;
        else consonant++;
    }
    
    return [vowel, consonant];
}
console.log('Vowels: '+ countVow_Con(str)[0]+ " Consonants: " + countVow_Con(str)[1]);