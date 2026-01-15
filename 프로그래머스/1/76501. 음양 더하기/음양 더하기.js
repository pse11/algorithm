function solution(absolutes, signs) {
    return signs.reduce((acc,cur,i)=>{
        if(cur){ //true일 때
            return acc+absolutes[i];
        }else{
            return acc-absolutes[i];
        }
    },0);
}