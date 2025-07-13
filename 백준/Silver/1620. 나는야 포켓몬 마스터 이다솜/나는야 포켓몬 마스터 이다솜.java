import java.io.*;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    Map<String, Integer> spo = new HashMap<>(); //숫자로 이름 찾을 수 있는 맵
    String[] npo = new String[N];  //이름으로 숫자 찾을 수 있는 문자열배열
    for(int i=0;i<N;i++){
      String name = br.readLine();
      spo.put(name, i+1);
      npo[i]=name;
    } 
    for(int i=0;i<M;i++){
      String s = br.readLine();
      try{
        int num = Integer.parseInt(s);  
        sb.append(npo[num-1]+"\n");
      }catch(NumberFormatException e){
        sb.append(spo.get(s)+"\n");
      }
    }
    System.out.println(sb);
  }
}