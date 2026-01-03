function solution(arr1, arr2) {
    //배열의 길이가 같다면 모든 원소의 합 : reduce 로 구하기
    if(arr1.length===arr2.length){
        //sum1의 합
        const sum1 = arr1.reduce((arr,cur)=>arr+cur,0);
        //sum2의 합
        const sum2 = arr2.reduce((arr,cur)=>arr+cur,0);
        if(sum1>sum2){
            return 1;
        }else if(sum1<sum2){
            return -1;
        }else {
            return 0;
        }
    }else{ //배열의 길이가 다르다면
        return arr1.length>arr2.length? 1 : -1;
    }
}