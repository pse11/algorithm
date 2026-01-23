function solution(sizes) {
    //긴 변을 가로로 몰아넣고
    //가로 중 최대 x 세로 중 최소 
    let maxWidth = 0;
    let minHeight = 0;

    sizes.forEach(item=>{
        const width = Math.max(item[0],item[1]);
        const height = Math.min(item[0],item[1]);
        
        if(width > maxWidth) maxWidth = width;
        
        if(height>minHeight) minHeight = height;
    });
    
    return maxWidth*minHeight;
}