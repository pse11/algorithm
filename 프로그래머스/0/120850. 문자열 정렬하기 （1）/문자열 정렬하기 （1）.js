function solution(my_string) {
    let result = []
    for(let i=0;i<my_string.length;i++){
        if(!isNaN(my_string[i])){
            result.push(parseInt(my_string[i]))
        }
    }
    return result.sort()
}