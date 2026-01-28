function solution(arr) {
    let list = [];
    for(let i=0;i<=10;i++){
        list.push(2**i)
    }
    // arr의 길이가 2의 거듭제곱인지 확인
    if(list.includes(arr.length)){
        return arr;
    }else{// 아니면 가장 가까운 거듭제곱이 되도록 0 추가
        list.push(arr.length);
        list.sort((a,b)=>a-b);
        const len = list[list.indexOf(arr.length)+1]-arr.length;
        return [...arr, ...new Array(len).fill(0)];
    }
    
}