import java.io.*;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int title = 666; // 영화의 제목 종말의 수
    int count = 1;
    while(count!=N){
      title++;
      if((title+"").contains("666")){ //제목에 종말의 수 666이 포함될 경우
        count++; 
      }
    }
    System.out.println(title);
  }
}