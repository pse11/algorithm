class Heap{
    constructor(){
        this.heap = [];
    }
    
    //삽입
    push(val){
        this.heap.push(val);
        this.bubbleUp();
    }
    
    //삭제
    pop(){
        if(this.size()===0) return null;
        if(this.size()===1) return this.heap.pop();
        const top = this.heap[0];
        this.heap[0] = this.heap.pop();
        this.bubbleDown();
        return top;
    }
    
    size(){
        return this.heap.length;
    }
    
    bubbleUp(){
        let index = this.heap.length-1;
        while (index > 0) {
            let parentIndex = Math.floor((index - 1) / 2);
            // 소요시간(index 1) 기준 최소 힙
            if (this.heap[parentIndex][1] <= this.heap[index][1]) break;
            
            [this.heap[parentIndex], this.heap[index]] = [this.heap[index], this.heap[parentIndex]];
            index = parentIndex;
        }
    }
    bubbleDown() {
        let index = 0;
        while (true) {
            let leftChild = index * 2 + 1;
            let rightChild = index * 2 + 2;
            let smallest = index;

            if (leftChild < this.size() && this.heap[leftChild][1] < this.heap[smallest][1]) {
                smallest = leftChild;
            }
            if (rightChild < this.size() && this.heap[rightChild][1] < this.heap[smallest][1]) {
                smallest = rightChild;
            }

            if (smallest === index) break;
            [this.heap[index], this.heap[smallest]] = [this.heap[smallest], this.heap[index]];
            index = smallest;
        }
    }
}

function solution(jobs) {
   // 요청 시간 순으로 원본 배열 정렬
    jobs.sort((a,b)=>a[0]-b[0]);
    
    const heap = new Heap();
    let totalWaitTime = 0; // 모든 작업의 종료시간 - 요청시간의 합
    let time = 0; //현재 시각
    let index = 0;
    let completedJobs = 0;
    
    while (completedJobs < jobs.length) {
        //현재 시간까지 들어온 모든 요청을 힙에 푸시
        while (index < jobs.length && jobs[index][0] <= time) {
            heap.push(jobs[index]);
            index++;
        }

        if (heap.size() > 0) {
            // 소요시간이 가장 짧은 것을 꺼내서 처리
            const [requestTime, duration] = heap.pop();
            time += duration;
            totalWaitTime += (time - requestTime);
            completedJobs++;
        } else {
            // 처리할 작업이 없으면 다음 작업의 요청 시간으로 건너뜀
            time = jobs[index][0];
        }
    }

    return Math.floor(totalWaitTime / jobs.length);
}