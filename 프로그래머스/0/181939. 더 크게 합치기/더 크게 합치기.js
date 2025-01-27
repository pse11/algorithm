function solution(a, b) {
    let s1,s2;
    s1=String(a)+String(b);
    s2=String(b)+String(a);
    return (s1>s2)?Number(s1):Number(s2);
}