//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let char = prompt("Enter character: ");

function isDigit(char){
    return !isNaN(char)
}

isDigit(char) ? console.log('Its digit') : console.log('Not digit');