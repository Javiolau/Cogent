//install: npm install prompt-sync
const prompt=require("prompt-sync")({sigint:true});

let num = prompt("Enter Number: ")
let prime = false;

for(let i = 2; i <= num; i++){
    if(num == i) {
        prime = true;
        break;
    }
    
    if (num%i == 0){
        prime = false;
        
        break;
    }
    
}

prime ? console.log( num + ' is prime') : console.log(num +' not prime');