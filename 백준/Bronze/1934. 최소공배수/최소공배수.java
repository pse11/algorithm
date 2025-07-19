import java.io.*;
import java.util.StringTokenizer;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    //a,b 의 최소공배수는 
    // LCM(a,b) = (a x b) / GCD(a,b) => GCD는 최대 공약수, 유클리드 호제법으로 구함
  
    int T = Integer.parseInt(br.readLine());
    for(int i=0;i<T;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());

      sb.append(LCM(A,B)+"\n");
    }
    System.out.println(sb);
  }

  //최소공배수 구하기
  public static String LCM(int A, int B){
    long res = (long)(A*B)/GCD(A,B);
    return res+"";
  }
  //최대공약수 구하기
  public static int GCD(int A, int B){
    if(B==0) return A; //A%B가 0일 때 A가 최대 공약수가 된다.
    return GCD(B,A%B);
  }
}