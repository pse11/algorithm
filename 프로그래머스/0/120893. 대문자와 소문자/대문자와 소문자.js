function solution(my_string) {
    return my_string.split('').map((value)=>value===value.toUpperCase()?value.toLowerCase():value.toUpperCase()).join('')
}