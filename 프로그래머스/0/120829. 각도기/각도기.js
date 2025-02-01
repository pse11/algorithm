function solution(angle) {
    let result=0;
    if(angle>0&&angle<90){
        result=1;
    }if(angle===90){
        result=2;
    }if(angle>90&&angle<180){
        result=3;
    }if(angle===180){
        result=4;
    }
    return result;
} 