function solution(participant, completion) {
    let map = new Map();
    
    for(let i=0;i<participant.length;i++){ //자바스크립트는 index 에러가 나지 않음. undefined를 return.
        let a =  participant[i];
        let b = completion[i];
        
        map.set(a, (map.get(a)||0)+1); //자바스크립트에서 undefined는 falsy이기 때문에 map에 key가 없는 경우 undefined로 false -> 0으로 set
        map.set(b, (map.get(b)||0)-1);
    }
    
    for(let [name, value] of map){
        if(value>0){
            return name;
        }
    }
}
