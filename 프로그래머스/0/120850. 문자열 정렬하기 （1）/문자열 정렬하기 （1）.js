function solution(my_string) {
    return my_string.split('').filter((value)=>!isNaN(value)).map((value)=>parseInt(value)).sort()
}