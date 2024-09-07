function solution(my_string) {
    let result=[]
    for(let i=0;i<my_string.length;i++){
        if(my_string[i]===my_string[i].toUpperCase()){
            result[i]=my_string[i].toLowerCase()
        }else {
            result[i]=my_string[i].toUpperCase()
        }
    }
    return result.join('')
}