function solution(array) {
    let max = array[0]
    let index = 0
    for(const i in array){
       if(max<array[i]){
           max=array[i]
           index = i
       }
    }
    return [max,parseInt(index)]
}