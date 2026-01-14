function solution(x) {
    let arr = [];
    let n = x;
    do{
        arr.push(n%10);
        n=Math.floor(n/10);
    }while(n>0);
    //return arr;
    return x%arr.reduce((acc,cur)=>acc+cur,0)===0? true:false;
}