function solution(num_list) {
    let mul = (acc, cur) => acc*cur;
    let add = (acc, cur) => acc+cur;
    
    return num_list.length>10?
        num_list.reduce(add,0):
        num_list.reduce(mul,1);
}