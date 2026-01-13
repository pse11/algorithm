function solution(num_list, n) {
    let arr = num_list.slice(n);
    arr.push(...num_list.slice(0,n));
    return arr;
    
    
}