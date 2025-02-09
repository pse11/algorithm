function solution(rsp) {
    const winarr={"2":"0","0":"5","5":"2"};
    let result='';
    for(let i of rsp){
        result+=winarr[i];
    }
    return result;
}