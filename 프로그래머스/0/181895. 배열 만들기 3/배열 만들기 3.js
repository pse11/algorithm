function solution(arr, intervals) {
    let [[a1,b1],[a2,b2]] = intervals;
    let result = [];
    
    for(let i=a1;i<=b1;i++){
        result.push(arr[i]);
    }
    for(let i=a2;i<=b2;i++){
        result.push(arr[i]);
    }
    return result;
}