function solution(my_string, alp) {
    let result = my_string.replaceAll(alp,alp.toUpperCase());
    return result;
}