function solution(n_str) { 
    //0이 아닌 문자열을 찾아 해당 인덱스까지 제외해 splice 
    return n_str.substr(n_str.search(/[^0]/));
}