function solution(answers) {
    const A = [ 1, 2, 3, 4, 5];
    const B = [2, 1, 2, 3, 2, 4, 2, 5];
    const C = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    let count = [0,0,0];
    
    answers.forEach((item,i)=>{
        
        if(A[i%A.length]===item){
            count[0]++;
        }
        if(B[i%B.length]===item){
            count[1]++;
        }
        if(C[i%C.length]===item){
            count[2]++;
        }
    })
    const maxScore = Math.max(...count);
    return [1,2,3].filter((item,i)=>
        count[i]===maxScore);
}