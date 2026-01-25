function solution(brown, yellow) {
    //brown + yello 한 값이 넓이가 될 수 있는 가로 세로 길이 구하기
    const area = brown + yellow ;
    
    //세로는 최소 3부터 시작(테두리가 갈색, 안쪽 노란색)
    for(let h=3;h<=Math.sqrt(area);h++){
        if(area%h===0){
            let w = area/h;
            
            if((w-2)*(h-2)===yellow){
                return [w,h];
            }
        }
    }
}