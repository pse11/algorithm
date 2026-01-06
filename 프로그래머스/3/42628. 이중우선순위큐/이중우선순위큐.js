function solution(operations){
    let queue = [];
    
    operations.forEach(op => {
        let [command, value] = op.split(" ");
        let num = Number(value);
        
        if(command==="I"){
            queue.push(num);
            queue.sort((a,b)=>a-b); //오름차순 정렬
        }else if(command ==="D"&&queue.length>0){
            if(num===1){
                queue.pop(); //최댓값 삭제
            }else{
                queue.shift(); //최솟값 삭제
            }
        }
    });
    return queue.length===0?[0,0] : [queue[queue.length-1],queue[0]];
}