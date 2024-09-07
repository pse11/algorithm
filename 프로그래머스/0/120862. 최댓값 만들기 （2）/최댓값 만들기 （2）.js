function solution(numbers) {
    let max = numbers[0]*numbers[1]
    for(let i=0;i<numbers.length;i++){
        for(let j=0;j<numbers.length;j++){
            if(i===j){
                break
            }else{
                if(max<numbers[i]*numbers[j]){
                    max=numbers[i]*numbers[j]
                }
            }
        }
    }
    return max
}