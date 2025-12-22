function solution(priorities, location) {
    let count = 0;
    //인덱스를 포함하는 객체 배열 생성
    let queue = priorities.map((p,i)=>({
        p:p,
        i:i
    }));
    while(queue.length>0){
        //shift로 맨 앞의 요소 꺼냄
        let current = queue.shift();
         //우선순위가 높지 않다면 큐 맨 뒤에 push
        if(queue.some(item=>item.p>current.p)){
           
            queue.push(current);
        }else{
            //현재 우선순위가 가장 높다면 실행
            count++;
            //현재 실행 프로세스의 인덱스가 location과 같은지 
            if(current.i===location){
                return count;
            }
        }
    }
    
}