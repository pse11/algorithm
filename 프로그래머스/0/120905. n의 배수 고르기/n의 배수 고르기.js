function solution(n, numlist) {
    var answer = [];
    for(let i=0;i<numlist.length;i++){
        if(numlist[i]%n==0){ //n의 배수일 때
            answer.push(numlist[i]);
        }
    }
    return answer;
}