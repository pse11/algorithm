function solution(myString) {
    let result = '';
    for(let i=0;i<myString.length;i++){
        if(myString[i]<'l'){
            result+='l';
        }else{
            result+=myString[i];
        }
    }
    return result;
}