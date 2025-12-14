function solution(phone_book) {
    let map = new Map();
    
    //해시맵에 배열 저장
    for(p of phone_book){
        map.set(p);
    }
    //접두어 확인
    for(p of phone_book){
        for(let i=1;i<p.length;i++){
            let prefix = p.slice(0,i); //각 부분 문자열을 만들어 map에 있는지 확인
            if(map.has(prefix)){
                return false;
            }
        }
    }
    return true;
}