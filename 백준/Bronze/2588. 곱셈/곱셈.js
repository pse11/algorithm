let fs = require('fs');
let input = fs.readFileSync('dev/stdin').toString().split('\n');

let A = input[0].trim();
let B = input[1].trim();

for(let i=B.length-1;i>=0;i--){
  console.log(A*B[i]);
}

console.log(A*B);


