function solution(n) {
    for(let i=1;i<=n;i++){
        if(n/i==i){ //몫과 같을 때 제곱수로 판단
            return 1;
        }
    }
    return 2;
}