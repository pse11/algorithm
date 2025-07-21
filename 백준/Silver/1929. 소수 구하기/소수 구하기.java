import java.io.*;
import java.util.StringTokenizer;


public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    for(int i=M;i<=N;i++){ //M 이상 N이하의 소수 구하기
      if(isPrime(i)){
        System.out.println(i);
      }
    }
  }
  public static boolean isPrime(int n){
    if(n<2) return false; //0,1은 소수 아님
    if(n==2) return true; //2는 소수
    for(int i=2;i<=Math.sqrt(n);i++){//√N이하의 자연수로 나눠지면 소수아님
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
}