function solution(hp) {
    let array=[]
    array[0]=Math.floor(hp/5)
    array[1]=Math.floor(hp%5/3)
    array[2]=Math.floor(hp%5%3)
    let sum=0
    for(let i=0;i<3;i++){
        sum+=array[i]
    }
    return sum
}