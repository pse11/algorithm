function solution(age) {
    let nums={0:'a',1:'b',2:'c',3:'d',4:'e',5:'f',6:'g',7:'h',8:'i',9:'j'};
    age=String(age);
    let agearr=age.split('');
    let result='';
    for(let i of agearr){
        result+=nums[i];
    }
    return result;
}