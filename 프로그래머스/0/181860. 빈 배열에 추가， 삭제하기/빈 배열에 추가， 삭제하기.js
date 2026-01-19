function solution(arr, flag) {
    
       return arr.reduce(
    (prev, num, i) => flag[i]? [...prev, ...new Array(num*2).fill(num)] : prev.slice(0,-num),[]);
}