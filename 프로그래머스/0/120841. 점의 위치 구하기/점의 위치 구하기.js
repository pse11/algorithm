function solution(dot) {
    let result = 0
    if(dot[0]>0&&dot[1]>0){result=1}
    if(dot[0]<0&&dot[1]>0){result=2}
    if(dot[0]<0&&dot[1]<0){result=3}
    if(dot[0]>0&&dot[1]<0){result=4}
    return result
}