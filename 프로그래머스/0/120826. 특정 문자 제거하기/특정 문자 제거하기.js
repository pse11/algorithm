function solution(my_string, letter) {
    let result='';
    for(let i of my_string){
        if(i===letter){
            continue;
        }else {
            result+=i;
        }
    }
    return result;
}