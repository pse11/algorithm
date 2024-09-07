function solution(n, numlist) {
    let result = []
    for(data of numlist){
        if(data%n===0){
            result.push(data)
        }
    }
    return result
}