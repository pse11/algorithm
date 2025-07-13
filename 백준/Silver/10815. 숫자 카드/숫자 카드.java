import java.io.*;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.HashSet;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); //상근이 가지고 있는 카드 개수
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    Set<Integer> nset = new HashSet<>();
    for(int i=0;i<N;i++){
      nset.add(Integer.parseInt(st.nextToken()));
    }
    int M = Integer.parseInt(br.readLine()); //비교할 카드
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<M;i++){
      int a = Integer.parseInt(st.nextToken());
      if(nset.contains(a)){
        sb.append(1+" ");
      }else{
        sb.append(0+" ");
      }
    }
    System.out.println(sb);
  }
}