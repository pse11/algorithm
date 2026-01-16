function solution(my_string, indices) {
    return Array.from(my_string).filter((v,i)=>!indices.includes(i)).join("");
}