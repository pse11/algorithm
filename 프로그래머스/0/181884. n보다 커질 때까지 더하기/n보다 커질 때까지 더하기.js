function solution(numbers, n) {
    let acc = 0;
    
    for(const cur of numbers){
        acc+=cur;
        if(acc>n){
            return acc;
        }
    }
}