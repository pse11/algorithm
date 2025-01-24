const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
}).on('line', function(line) {
    let result="";
    const [str,i] = line.split(' ');
    for(let index=0;index<i;index++){
        result+=str;
    }
    console.log(result);
});