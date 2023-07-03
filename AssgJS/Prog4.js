//install: npm install prompt-sync
 const prompt=require("prompt-sync")({sigint:true});

 let num = prompt("Enter Number: ")

 function isPrime(num) {
    
    for(let i = 2; i <= num; i++){
        if(num == i) {
            return true
        }
        
        if (num%i == 0){
            return false;   
        }
    }
    return false
 }

const factors = [];
for (let i = 2; i < num; i++) {
    
    if(isPrime(i) && num % i == 0) factors.push(i);
}


isPrime(num) ? console.log(num) : console.log(...factors);
