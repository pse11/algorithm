function solution(binomial) {
    //함수 반환 객체 선언
    const ops = {
        "+": (a,b)=>a+b,
        "-": (a,b)=>a-b,
        "*": (a,b)=>a*b
    };
    
    const [a, op, b] = binomial.split(" ");
    return ops[op](+a,+b); //+a로 바로 숫자로 변경하여 전달
}