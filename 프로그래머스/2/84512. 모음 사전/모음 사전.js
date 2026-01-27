function solution(word) {
    const vowels = ["A","E","I","O","U"];
    let count = 0;
    let answer = 0;
    
    function dfs(currentWord){
        //현재 단어가 찾는 단어와 같다면 정답 저장
        if(currentWord ===word){
            answer=count;
            return;
        }
        
        //길이가 5라면 더 이상 글자를 붙일 수 없으므로 리턴
        if(currentWord.length ===5) return;
        
        for(let i=0;i<vowels.length;i++){
            if(answer > 0) return ;//이미 답 찾았다면 탐색 중단
            count++; //단어 하나 만들때마다 순서 증가
            dfs(currentWord+vowels[i]);
        }
    }
    dfs("");
    return answer;
}