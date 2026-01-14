function solution(n) {
    let result = Array.from(new Array(n),()=>new Array(n).fill(0));
    
    for(let i=0;i<n;i++){
        for(let j=0;j<n;j++){
            if(i===j){
                result[i][j]=1;
            }
        }
    }
    return result;
}