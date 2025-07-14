import java.io.*;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
  
    int N = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[N];
    Integer[] sortarr = new Integer[N];
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<N;i++){
      String token = st.nextToken();
      arr[i] = Integer.parseInt(token);
      sortarr[i] = Integer.parseInt(token);
    }
    Arrays.sort(sortarr);

    int rank = 0;
    Map<Integer,Integer> map = new HashMap<>();
    for(int num: sortarr){
      if(!map.containsKey(num)){
        map.put(num,rank);
        rank++;
      }
    }
    for(int num:arr){
      sb.append(map.get(num)+" ");
    }
    System.out.println(sb);
  }
}