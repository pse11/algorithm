import java.io.*;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    
    int N = Integer.parseInt(br.readLine());
    Map<Integer,Integer> ncard = new HashMap<>();
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<N;i++){
      int k = Integer.parseInt(st.nextToken());
      //카드가 이미 존재하는지 containskey로 확인후 있으면 value값에 +1해준다.
      if(ncard.containsKey(k)){ //이미 있는 카드일때
        ncard.put(k,ncard.get(k)+1);
      }else{
        ncard.put(k,1); //새로운 카드일때
      }
    }
    int M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<M;i++){
      int j = Integer.parseInt(st.nextToken());
      if(ncard.containsKey(j)){
        sb.append(ncard.get(j)+" ");
      }else{
        sb.append(0+" ");
      }
    }
    System.out.println(sb);

  }
}