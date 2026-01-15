function solution(order) {
    let count = 0;
    do{
        if(order%10!==0&&(order%10)%3===0){
            count++;
        }
        order = Math.floor(order/10);
    }while(order>0);
    return count;
}