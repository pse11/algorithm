function solution(n) {
    let count = 0;
    let arr =[];
    for(let i=4;i<=n;i++){
        if(getDivisors(i)>=3){count++}
    }
    return count;
}

const getDivisors = (num) =>{
    let arr = [];
    for(let i=1;i<=num/2;i++){
        if(num%i===0) arr.push(i);
    }
    return arr.length+1;
}