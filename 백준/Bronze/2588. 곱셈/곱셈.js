let fs = require('fs');
let input = fs.readFileSync('dev/stdin').toString().split('\n');

let A = input[0].trim();
let B = input[1].trim().split("");
let result=0;

for(let i=B.length-1;i>=0;i--){
  let num =A*B[i]*(10**(B.length-i-1));
  console.log(A*B[i]);
  result+=num;
}

console.log(result);

