class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        if(a>b){
            int c;
            c=a;
            a=b;
            b=c;
        }
        for(long i =a; i<=b;i++){
            sum+=i;
        }
        return sum;
    }
}