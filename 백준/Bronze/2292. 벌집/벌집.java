import java.util.Scanner;
import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    //규칙
    /*
     * 1
     * 2~7
     * 8~19
     * 20~37
     * 시작하는 방번호가 6의 배수만큼 증가
     */
    int count = 1; //거리
    int range = 2; //범위의 시작하는 방 번호
    if(N==1){
      bw.write(count+"");
    }else{
      while(range<=N){
        range = range+(6*count);
        count++;
      }
      bw.write(count+"");
    }
    bw.close();
  }
}