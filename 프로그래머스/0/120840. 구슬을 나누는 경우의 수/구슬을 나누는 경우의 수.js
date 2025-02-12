function solution(balls, share) {
    
    let nresult=1;
    let mresult=1;
    let kresult=1;
    for(let i=1;i<=balls;i++){
        nresult*=i;
    }
    for(let j=1; j<=share;j++){
        mresult*=j;
    }
    for(let k=1;k<=(balls-share);k++){
        kresult*=k;
    }
    return Math.round(nresult/kresult/mresult);
}