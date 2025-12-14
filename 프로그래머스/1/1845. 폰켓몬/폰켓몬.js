function solution(nums) {
    let max = nums.length/2;
    let map = new Map();
    for(i of nums){
        if(!map.has(i)){
            map.set(i,1);
        }else{
            map.set(i,map.get(i)+1);
        }
    }
    if(map.size<max){
        return map.size;
    }else{
        return max;
    }
}