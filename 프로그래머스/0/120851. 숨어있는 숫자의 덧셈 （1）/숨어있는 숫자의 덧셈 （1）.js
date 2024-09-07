function solution(my_string) {
    let sum =0
    let str = my_string.replace(/[^0-9]/g, "");
    for(let i=0;i<str.length;i++){
        sum+=parseInt(str[i])
    }
    return sum
}