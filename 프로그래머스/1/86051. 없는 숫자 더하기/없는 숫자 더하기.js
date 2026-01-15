function solution(numbers) {
    //return 45-numbers.reduce((acc,cur)=>acc+cur,0);
    
    let sum = 0;
    for(let i=0;i<=9;i++){
        !numbers.includes(i)?sum+=i:sum+=0;
    }
    return sum;
}