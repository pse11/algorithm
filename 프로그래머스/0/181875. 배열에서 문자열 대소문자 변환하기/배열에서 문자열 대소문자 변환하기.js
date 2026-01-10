function solution(strArr) {
    return strArr.map((v,i)=>{
        return i%2===1?v.toUpperCase():v.toLowerCase();
    })
}