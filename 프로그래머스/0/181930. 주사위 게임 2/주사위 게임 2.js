function solution(a, b, c) {
    let score;
    if(a===b&&a===c&&b===c){
        score = (a+b+c)*(a**2+b**2+c**2)*(a**3+b**3+c**3);
    } else if(a!==b&&a!==c&&b!==c){
        score = a+b+c;
    } else {
        score = (a+b+c)*(a**2+b**2+c**2);
    }
    return score;
}