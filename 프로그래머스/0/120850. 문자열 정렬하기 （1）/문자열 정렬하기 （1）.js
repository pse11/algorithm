function solution(my_string) {
    var answer = my_string
                    .split('')
                    .filter((v)=>!isNaN(v))
                    .map(Number);
    return answer.sort();
}