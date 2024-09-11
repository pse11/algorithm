function solution(numbers) {
    let sum = 0
    for(data of numbers){
        sum+=data
    }
    return sum/numbers.length
}