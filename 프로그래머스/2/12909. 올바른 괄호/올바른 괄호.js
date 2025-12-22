function solution(s){
    //스택에 '(' 일 때 push, ')' 일 때 pop 해서 남은게 없으면 true, 있으면 false
    let stack = [];
    if(s[0]===')'){
        return false;
    }
    for(let i=0;i<s.length;i++){
        if(s[i]==='('){
            stack.push(1);
        }else{
            stack.pop();
        }
    }
    return stack.length===0? true : false;
}