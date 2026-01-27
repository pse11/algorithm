function solution(my_string, s, e) {
    const string = my_string.substring(s,e+1);
    const reverse_str = string.split("").reverse().join("");
    
    return my_string.replace(string, reverse_str);
}