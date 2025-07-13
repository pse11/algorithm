import java.io.*;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.HashSet;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    Set<String> nset = new HashSet<>();
    int count = 0;
    for(int i=0;i<N;i++){
      nset.add(br.readLine());
    }
    for(int i=0;i<M;i++){
      String str = br.readLine();
      if(nset.contains(str)){
        count++;
      }
    }
    System.out.println(count);
  }
}