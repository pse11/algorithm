function solution(n) {
    var answer = [];
    while(n!=1){ //1에 도달하지 않을 때까지
        if(n%2==0){//짝수일 때
            answer.push(n);
            n/=2;
            
        }else{ //홀수일 때
            answer.push(n);
            n=3*n+1;
        }
    }
    answer.push(1);
    return answer;
}