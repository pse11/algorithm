function solution(box, n) {
    let result =1
    for(len of box){
        result*=Math.floor(len/n)
    }
    return result
}