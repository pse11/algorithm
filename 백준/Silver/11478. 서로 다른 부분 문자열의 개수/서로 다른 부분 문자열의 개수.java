import java.io.*;
import java.util.Set;
import java.util.HashSet;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    //문자열 S입력
    String S = br.readLine();

    //중복 제거해야하기 때문에 Set
    Set<String> set = new HashSet<>();
    //부분 문자열로 자를 길이
    for(int i=0;i<S.length();i++){
      //i=0일경우, j=0,1,2,3,4 , i=1일경우, j=(0,1),(1,2),(2,3),(3,4)
      for(int j=0;j<S.length()-i;j++){
        // 인덱스 j부터 j+i까지의 문자열을 추출하여 set에 add
        set.add(S.substring(j, j+i+1));
      }
    }
  
    System.out.println(set.size());
  }
}