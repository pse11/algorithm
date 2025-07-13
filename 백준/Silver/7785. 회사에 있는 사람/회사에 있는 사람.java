import java.io.*;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Comparator;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    Map<String, String> map = new HashMap<>();
    List<String> res = new ArrayList<>();
    for(int i=0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      map.put(st.nextToken(),st.nextToken());
    }
    for(Entry<String,String>entry : map.entrySet()){
      if(entry.getValue().equals("enter")){
        res.add(entry.getKey());
      }
    }
    Collections.sort(res,new Comparator<String>() {
      @Override
      public int compare(String a, String b){
        return -a.compareTo(b);
      }
    });
    for(String st : res){
      System.out.println(st);
    }
  }
}