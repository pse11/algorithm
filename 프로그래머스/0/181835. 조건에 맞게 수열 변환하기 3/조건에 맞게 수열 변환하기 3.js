function solution(arr, k) {
    let result = [];
    if(k%2==1){ //홀수
        result = arr.map(function(item){
            return item*k;
        });
    }else{
        result = arr.map(function(item){
            return item+k;
        })
    }
    return result;
}