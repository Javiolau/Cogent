//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let str1 = prompt("Enter String: ");
let str2 =  prompt("Enter palindrome: ");

function palindrome(str1,str2){
    if(str1.length != str2.length) 
        return false;

    const strRev = str2.split('').reverse().join('');
    return strRev == str1;
}

palindrome(str1,str2) ? console.log('Its Palindrome') : console.log('Not Palindrome');;