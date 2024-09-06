function solution(array) {
    array = array.sort((a,b)=>b-a)
    const index=(array.length-1)/2
    const result = array[index]
    return result
}