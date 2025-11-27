function solution(num, k) {
    let result = String(num).indexOf(k);
    return result===-1?-1 : result+1;
}