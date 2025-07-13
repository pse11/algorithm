import java.io.*;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    Set<String> nset = new HashSet<>();
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    List<String> res = new ArrayList<>();
    for(int i=0;i<N;i++){
      nset.add(br.readLine());
    }
    for(int i=0;i<M;i++){
      String s = br.readLine();
      if(nset.contains(s)){
        res.add(s);
      }
    }
    Collections.sort(res);
    System.out.println(res.size());
    for(String rstr : res){
      System.out.println(rstr);
    }
  }
}