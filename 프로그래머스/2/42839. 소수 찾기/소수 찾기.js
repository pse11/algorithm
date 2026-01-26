function solution(numbers) {
    const arr = numbers.split("");
    const resultSet = new Set(); //중복 제거를 위해 Set 사용
    for(let i=1;i<=numbers.length;i++){
        const permutations = getPermutations(arr,i);
           permutations.forEach(p=>{
               const num = Number(p.join(""));
               if(isPrime(num)){
                   resultSet.add(num);
               }
           })
    }
    return resultSet.size;
}
 
const getPermutations = (arr, selectNumber)=>{
    const results = [];
    if(selectNumber===1) return arr.map((value)=>[value]);
    
    arr.forEach((fixed,index,origin)=>{
        const rest = [...origin.slice(0,index),...origin.slice(index+1)];
        const permutations = getPermutations(rest, selectNumber-1);
        const attached = permutations.map((permutation)=>[fixed,...permutation]);
        results.push(...attached);
    })
    return results;
}

function isPrime(num){
    if(num<=1){
        return false;
    }
    
    if(num%2===0){
        return num===2? true: false;
    }
    
    const sqrt = parseInt(Math.sqrt(num));
    
    for(let i=3;i<=sqrt;i+=2){
        if(num%i===0){
            return false;
        }
    }
    return true;
}

