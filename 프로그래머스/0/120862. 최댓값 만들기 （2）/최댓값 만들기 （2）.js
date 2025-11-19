function solution(numbers) {
    numbers.sort((a,b)=>a-b);
    const len = numbers.length;
    return Math.max(numbers[len-1]*numbers[len-2], numbers[0]*numbers[1]);
}