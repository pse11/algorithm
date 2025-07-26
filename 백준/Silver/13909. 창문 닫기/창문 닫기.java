import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
    int N = Integer.parseInt(br.readLine());
    /*1. 4명인 경우 1001 로 열린 창문의 개수는 2개.
    9명인 경우 100100001로 열린 창문의 개수는 3개.
    제곱수의 경우에만 창문이 +1 증가

      2. 창문번호는 자신의 약수의 개수만큼 열고 닫힌다.
      예) 3번( 약수 1,3) 2번 열고 닫힘.
          4번(약수 1,2,4) 3번 열고 닫힘.
       최종적으로는 약수의 갯수가 홀수인 경우의 창문 번호만 열린다.
         약수의 갯수가 홀수인 경우는 제곱수밖에 없다.
    */
    System.out.println((int)Math.sqrt(N));
  }
}