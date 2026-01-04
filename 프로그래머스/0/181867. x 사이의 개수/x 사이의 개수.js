function solution(myString) {
    const subs = myString.split("x");
    const result = subs.map((v)=>v.length);
    return result;
}