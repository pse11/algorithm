let fs = require('fs');
let input = fs.readFileSync('dev/stdin').toString().trim();
input=parseInt(input);
let grade="";
if(input>=90&&input<=100){
    grade="A";
}else if(input>=80&&input<=89){
     grade="B";
}else if(input>=70&&input<=79){
     grade="C";
}else if(input>=60&&input<=69){
     grade="D";
}else{
    grade="F";
}

console.log(grade);
