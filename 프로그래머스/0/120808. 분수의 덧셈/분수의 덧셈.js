function solution(number1, denom1, number2, denom2) {
    let denom = denom1*denom2;
    let number = number1*denom2 + number2*denom1;
    
    let a=denom;
    let b=number;
    const gcd = (a, b) => (a % b === 0 ? b : gcd(b, a % b));
    const result = [];
    
    result[0]=b/gcd(a,b);
    result[1]=a/gcd(a,b);
    
    return result;
}