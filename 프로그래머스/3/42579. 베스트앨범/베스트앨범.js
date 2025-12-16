function solution(genres, plays) {
    let map = new Map();
    
    for(let i=0;i<genres.length;i++){
        let genre = genres[i];
        let play = plays[i];
        
        //map에 장르 없으면 새로 만들기
        if(!map.has(genre)){
            map.set(genre, {total:0,songs:[]});
        }
        //value의 객체 데이터 꺼내서 추가
        let data = map.get(genre);
        data.total += play; //총 재생수 더함
        data.songs.push({index: i, play: play});
    }
    //정렬하기 위해 배열로 만들기
    let genreList = Array.from(map.values());
    
    //장르 순위 정렬 (총 재생수 많은 순서대로)
    genreList.sort((a,b)=>{
        return b.total-a.total;
    });

    let answer = [];
    
    for(let i=0;i<genreList.length;i++){
        let genreData = genreList[i];
        
        genreData.songs.sort((a,b)=>{
            if(a.play === b.play){
                return a.index-b.index; //번호 작은게 먼저
            }
            return b.play-a.play; //재생수 큰게 먼저
        });
        answer.push(genreData.songs[0].index);
        
        if(genreData.songs.length>1){
            answer.push(genreData.songs[1].index);
        }
    }
    return answer;
}