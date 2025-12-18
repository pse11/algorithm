function solution(arr)
{
    //결과 배열 생성
    let result = [];
    for(let i=0;i<arr.length;i++){
        //result 스택의 마지막 데이터와 일치 여부 확인
        if(result[result.length-1]!=arr[i]){
            result.push(arr[i]);
        }
    }
    return result;
}