function solution(n) {
    //문자로 풀이
     return Number(Array.from(n.toString()).sort((a,b)=>b-a).join(""));
    
    //숫자로 풀이(더빠름)
//     let arr = [];
    
//     do{
//         arr.push(n%10);
//         n=Math.floor(n/10);
//     }while(n>0);
    
//     return +arr.sort((a,b)=>b-a).join("");
}