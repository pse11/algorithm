function solution(participant, completion) {
    let map = new Map();
    //참여자 해시 추가
    for(let i=0;i<participant.length;i++){
        if(map.has(participant[i])){ //동명이인 여부
            map.set(participant[i],map.get(participant[i])+1);
        }else{
            map.set(participant[i],1);
        }
    }
    //완주자 해시 수정
    for(let i=0;i<completion.length;i++){
        map.set(completion[i],map.get(completion[i])-1);
        
    }
    //미완주자 찾기()
    for(const [name, value] of map){
        if(value>0) return name;
    }
}