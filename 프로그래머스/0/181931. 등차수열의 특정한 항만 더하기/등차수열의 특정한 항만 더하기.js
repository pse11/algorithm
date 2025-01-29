function solution(a, d, included) {
    let number = [];
    number[0]=a;
    let sum=0;
    for(let i =1;i<included.length;i++){
        number.splice(i, 0, a+=d);
    }
    for(let i=0;i<included.length;i++){
        if(included[i]===true){
            sum+=number[i];
        }
    }
    return sum;
}