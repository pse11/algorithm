function solution(progresses, speeds) {
    let result = [];
    //각 작업 며칠 걸리는지 배열
    let days = progresses.map((p,i)=>Math.ceil((100-p)/speeds[i]));
    //기준일 설정함
    let maxDay = days[0];
    let count = 1;
    
    for(let i=1;i<days.length;i++){
        if(days[i]<=maxDay){ //기준일보다 빨리 끝나면 기준일 배포일에 함께 배포
            count++;
        }else{//기준일보다 오래걸리면 이전 것들을 배포하고 기준일 갱신
            result.push(count);
            count = 1;
            maxDay = days[i];
        }
    }
    
    result.push(count);
    return result;
}