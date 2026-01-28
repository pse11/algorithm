function solution(arr) {
    const n = arr.length;
    
    const len = Math.pow(2,Math.ceil(Math.log2(n))) - n;
    
    return [...arr, ...new Array(len).fill(0)];
}