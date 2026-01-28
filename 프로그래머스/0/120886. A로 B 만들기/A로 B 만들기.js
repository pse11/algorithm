function solution(before, after) {
    const bstr = before.split("").sort().join("");
    const astr = after.split("").sort().join("");
    
    return bstr ===astr ? 1 : 0;
   
}