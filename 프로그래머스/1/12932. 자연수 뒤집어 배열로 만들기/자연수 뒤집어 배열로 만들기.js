function solution(n) {
    //문자풀이
    //return [...String(n)].reverse().map((v)=>+v);
    
    //숫자 풀이
    let arr = [];
    do{
        arr.push(n%10);
        n=Math.floor(n/10);
    }while(n>0);
    return arr;
}