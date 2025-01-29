function solution(n) {
    let p=1;
    while(true){
        if((6*p)%n===0){
            break;
        }
        p++;
    }
    return p;
}