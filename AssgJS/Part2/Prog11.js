//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let str = prompt("Enter String: ");

function countAlph(str){

    const alphaString = str.replace(/[^a-zA-Z]/g, '');
    const digitString = str.replace(/[^0-9]/g,'');

    return [alphaString.length, digitString.length, str.length-(digitString.length+alphaString.length)];
}
console.log('Alphabetic count: ' + countAlph(str)[0] + ' | Digit count: ' + countAlph(str)[1] + ' | Special char count: ' + countAlph(str)[2]);