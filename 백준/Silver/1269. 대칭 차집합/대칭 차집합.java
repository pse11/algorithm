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
    //set으로 입력받을때 이전에 set에 값이 있으면 remove
    //집합 A , B의 개수 입력받기
    int cA = Integer.parseInt(st.nextToken());
    int cB = Integer.parseInt(st.nextToken());
    Set<Integer> set = new HashSet<>();
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<cA;i++){
      int v = Integer.parseInt(st.nextToken());
      set.add(v);
    }
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<cB;i++){
      int v = Integer.parseInt(st.nextToken());
      if(set.contains(v)){
        set.remove(v);
      }else{
        set.add(v);
      }
    }
    System.out.println(set.size());
  }
}