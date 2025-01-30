function solution(money) {
    const result = [];
    result[0]=parseInt(money/5500);
    result[1]=parseInt(money%5500);
    return result;
}