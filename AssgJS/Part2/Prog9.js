//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let str = prompt("Enter String: ");

function countHigh(str){
    const frequency = {};

    for (let char of str) {
        if(char==' '){
            continue;
        }

        char = char.toLowerCase();

        frequency[char] = (frequency[char] || 0) +1
    }
    console.log(frequency);

    let highCount =0;
    let highChar ='';

    for (let char in frequency) {
        if (frequency[char] > highCount){
            highCount = frequency[char];
            highChar = char;
        }
    }
    return highChar;
}
console.log('Highest frequency character: ' + countHigh(str));