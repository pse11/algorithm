import java.io.*;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    //규칙
    /* 첫번째 줄의 점 개수의 제곱
     * 초기 2제곱
     * 1번 3제곱
     * 2번 5제곱
     * 3번 9제곱
     * 규칙 : (2의 n승 +1) 제곱
     */

    int first = 2;
    for(int i=0;i<N;i++){
      first = (int)Math.pow(2,i+1)+1;
    }
    bw.write((int)Math.pow(first,2)+"");
    bw.close();
  }
}