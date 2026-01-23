function solution(sizes) {
    //긴 변을 가로로 몰아넣고
    //가로 중 최대 x 세로 중 최소 
    const sortArr = sizes.map(([w,h])=>w<h? [h,w] : [w,h]);
    
    let maxSet = [0,0];
    
    sortArr.forEach(([w,h])=>{
        if( w > maxSet[0] ) maxSet[0] = w;
        if( h > maxSet[1] ) maxSet[1] = h;
    })
    
    return maxSet[0]*maxSet[1];
}