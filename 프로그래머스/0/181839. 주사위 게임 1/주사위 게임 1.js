function solution(a, b) {
    if(a%2===1&&b%2===1){ //모두 홀수
         return a*a+b*b;
    }else if(a%2===0&&b%2===0){ //모두 홀수 x
        return Math.abs(a-b);
    }else{ // 하나만 홀수
        return 2*(a+b);
    }
}