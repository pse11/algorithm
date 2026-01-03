class Heap{
    constructor(){
        this.heap=[];
    }
    swap(idx1, idx2){
        let tmp = this.heap[idx1];
        this.heap[idx1]=this.heap[idx2];
        this.heap[idx2]=tmp;
    }
    //삽입
    push(value){
        this.heap.push(value);
        this.bubbleUp();
    }
    bubbleUp(){
        let index = this.heap.length-1;
        while(index>0){
            let parentIndex = Math.floor((index-1)/2);
            if(this.heap[parentIndex]>this.heap[index]){
                this.swap(index,parentIndex);
            }else{
                break;
            }
            index = parentIndex;
        }
    }
    
    //삭제
    pop(){
        if(this.heap.length===0) return null;
        if(this.heap.length===1) return this.heap.pop();
        
        const root = this.heap[0];
        this.heap[0]=this.heap.pop();
        this.bubbleDown();
        return root;
    }
    
    bubbleDown(){
        let index = 0;
        while(true){
            let left = index * 2+ 1;
            let right = index * 2+2;
            let min = index;
            
            if(left<this.heap.length&&this.heap[left]<this.heap[min]){
                min=left;
            }
            if(right<this.heap.length&& this.heap[right]<this.heap[min]){
                min=right;
            }
            if(min===index) break;
            this.swap(index,min);
            index = min;
        }
    }
    //최상위 노드 
    peek(){
        return this.heap[0];
    }
    size(){
        return this.heap.length;
    }
    
}
function solution(scoville, K) {
    let count = 0;
    //힙 생성
    const heap = new Heap();
    //스코빌 삽입
    for(let i=0;i<scoville.length;i++){
        heap.push(scoville[i]);
    }
    //가장 작은 스코빌 pop, 두번째 작은 스코빌 pop
    while(heap.peek()<K){
        //음식 섞기 위해서는 최소 2개 이상 있어야함
        if(heap.size()<2){
            return -1;
        }
        let first = heap.pop();
        let second = heap.pop();
        let newScore = first + (second*2);
        heap.push(newScore);
        count ++;
    }
     return count;
}
