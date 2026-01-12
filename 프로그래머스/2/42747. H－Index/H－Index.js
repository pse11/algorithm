function solution(citations) {
    citations.sort((a,b)=>b-a); //내림차순 정렬
    const n = citations.length;
    let hIndex = 0;
    for(let i=0;i<n;i++){
        if(citations[i]>=i+1){
            hIndex=i+1;
        }else{
            break;   
        }
    }
    return hIndex;
}