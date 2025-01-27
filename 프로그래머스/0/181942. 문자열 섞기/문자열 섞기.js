function solution(str1, str2) {
    const arr=[];
    for(let i=0;i<str1.length;i++){
        arr.push(str1[i]+str2[i]);
    }
    const result = arr.join('');
    return result;
}