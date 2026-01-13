function solution(names) {
    return names.filter((v,i)=>{
        if(i%5===0){
            return v;
        }
    })
}