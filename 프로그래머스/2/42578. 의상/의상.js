function solution(clothes) {
    let answer = 1;
    let map = new Map();
    for(let[name,type] of clothes) { //주어진 배열 순회
        map.set(type, map.get(type)+1 || 1); //map에 type(종류)가 있으면 그 값에 +1, 없으면 1로 set     
    }
    for(let [type,name] of map){
        answer *= name+1 //입지 않는 경우의 수까지 1 더해줌
    }
    return answer-1; //최종 아무것도 입지 않은 경우는 빼준다.
}