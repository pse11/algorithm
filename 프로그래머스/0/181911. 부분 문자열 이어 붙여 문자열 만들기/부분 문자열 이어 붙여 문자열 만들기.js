function solution(my_strings, parts) {
    return my_strings.map((v,i)=>{
        return v.slice(parts[i][0],parts[i][1]+1);
    }).join("");
}