import java.io.*;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    //규칙
    /* 첫번째 줄의 점 개수의 제곱
     * 초기 2제곱
     * 1번 (2+1)제곱
     * 2번 (3+2)제곱
     * 3번 (5+4)제곱
     * 4번 (9+8)제곱
     * 규칙 : (앞의 결과 + 2의 (번수 -1)승)의 제곱
     */

    int first = 2;
    for(int i=0;i<N;i++){
      first = (first+ (int)Math.pow(2,i));
    }
    bw.write((int)Math.pow(first,2)+"");
    bw.close();
  }
}