function solution(price) {
    let result=price;
    if(price<300000&&price>=100000){
        result=price*0.95;
    }else if(price>=300000&&price<500000){
        result= price*0.9;
    }else if(price>=500000){
        result=price*0.8;
    }
    return Math.floor(result);
}