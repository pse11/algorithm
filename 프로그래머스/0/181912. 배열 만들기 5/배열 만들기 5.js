function solution(intStrs, k, s, l) {
    let result = [];
   intStrs.forEach((v)=>{
       const n = Number(v.slice(s,s+l));
       if(n>k){
           result.push(n);
       }
   })
    return result;
}