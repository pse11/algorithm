import java.io.*;
import java.util.StringTokenizer;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    //a,b 의 최소공배수는 
    // LCM(a,b) = (a x b) / GCD(a,b) => GCD는 최대 공약수, 유클리드 호제법으로 구함
  
    StringTokenizer st = new StringTokenizer(br.readLine());
    long A = Long.parseLong(st.nextToken());
    long B = Long.parseLong(st.nextToken());

    System.out.println(LCM(A, B));
  }

  //최소공배수 구하기
  public static String LCM(long A, long B){
    long res = (A*B)/GCD(A,B);
    return res+"";
  }
  //최대공약수 구하기
  public static long GCD(long A, long B){
    if(B==0) return A; //A%B가 0일 때 A가 최대 공약수가 된다.
    return GCD(B,A%B);
  }
}