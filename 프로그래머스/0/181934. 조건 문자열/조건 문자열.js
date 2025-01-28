function solution(ineq, eq, n, m) {
    let result;
    if (ineq===">"&&eq==="="){
        result=(n>=m);
    } else if(ineq==="<"&&eq==="="){
        result=(n<=m);
    }else if(ineq===">"&&eq==="!"){
        result=(n>m);
    }else if(ineq==="<"&&eq==="!"){
        result=(n<m);
    }
    return Number(result);
}