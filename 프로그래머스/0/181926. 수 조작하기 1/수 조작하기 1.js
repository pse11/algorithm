function solution(n, control) {
    for(let i of control){
        if(i==="w"){
            n++;
        }if(i==="s"){
            n--;
        }if(i==="d"){
            n+=10;
        }if(i==="a"){
            n-=10;
        }
    }
    return n;
}