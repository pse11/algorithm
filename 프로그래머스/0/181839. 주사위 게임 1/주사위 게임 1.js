function solution(a, b) {
    //삼항 연산자로 풀이 
    const isOdd = (num) => num%2===1; //홀수 여부 확인 함수
    
    return isOdd(a)&&isOdd(b) ? a*a+b*b 
        : !isOdd(a)&&!isOdd(b) ? Math.abs(a-b) 
        : 2 * (a+b);
    
}