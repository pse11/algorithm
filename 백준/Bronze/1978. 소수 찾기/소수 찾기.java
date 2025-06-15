import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    String[] str = br.readLine().split(" ");
    int count=0;
    for(int i=0;i<N;i++){
       //소수 개수
      int c = 0; //나눠지는 j 개수
      if(Integer.parseInt(str[i])!=1){
        for(int j=2;j<Integer.parseInt(str[i]);j++){ //1과 자기 자신이 아닌수들
          if(Integer.parseInt(str[i])%j==0){ //소수아님
            c++;
          }
        }
        if(c==0){ //c가 0이면 소수이다
          count++;
        }
      } 
    }
    bw.write(count+"");
    bw.close();
  }
}