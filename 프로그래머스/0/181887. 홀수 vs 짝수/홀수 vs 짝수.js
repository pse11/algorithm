function solution(num_list) {
    const s1 = num_list.reduce((acc,cur,idx)=>{
        if(idx%2===0){
            return acc+cur;
        }
        return acc;
    },0);
    const s2 = num_list.reduce((acc,cur,idx)=>{
        if(idx%2===1){
            return acc+cur;
        }
        return acc;
    },0);
    return s1>s2?s1:s2;
}