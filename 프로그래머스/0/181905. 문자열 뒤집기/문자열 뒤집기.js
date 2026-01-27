function solution(my_string, s, e) {
    const [a,b,c] = [my_string.slice(0,s), my_string.slice(s,e+1), my_string.slice(e+1)];
    
    return a+b.split("").reverse().join("")+c;
}