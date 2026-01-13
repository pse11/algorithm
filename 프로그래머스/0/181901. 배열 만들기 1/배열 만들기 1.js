function solution(n, k) {
    let result = [];
    for(let i=1;i<=n;i++){
        const a = i*k;
        if(a>n) break;
        result.push(a);
    }
    return result;
}