function solution(strArr) {
    //filter 사용하여 문자열 제거
    return strArr.filter((str)=>!str.includes("ad"));
}