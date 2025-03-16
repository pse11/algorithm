class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] arr = s.split("");
        int pcount = 0;
        int ycount = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i].equals("p")||arr[i].equals("P")){
                pcount++;
            }
            if(arr[i].equals("y")||arr[i].equals("Y")){
                ycount++;
            }
        }
        if(pcount!=ycount){
            answer = false;
        }
        return answer;
    }
}