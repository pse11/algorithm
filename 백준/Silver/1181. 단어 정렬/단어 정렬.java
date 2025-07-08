import java.io.*;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine()); //단어의 개수
    Set<String> set = new HashSet<>();
    for(int i=0;i<N;i++){
      set.add(br.readLine());
    }
    List<String> list = new ArrayList<>(set);

    Collections.sort(list, (a,b)->{
      if(a.length()==b.length()){ //길이가 같으면 사전순으로 정렬
        return a.compareTo(b);
      }else{ //길이가 다르면 짧은 것부터
        return a.length()-b.length();
      }
    });
    for(int i=0;i<list.size();i++){
      System.out.println(list.get(i));
    }
  }
}