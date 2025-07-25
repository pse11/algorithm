import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while(true){
      //자연수 n 입력
      int n = Integer.parseInt(br.readLine());
      //0입력시 종료
      if(n==0){break;}
    
      int count = BertPrime(n);
      System.out.println(count);
    }
  }

  //n보다 크고, 2n보다 작거나 같은 소수의 개수 구하는 메소드
  public static int BertPrime(int n){
    int res = 0;
    for(int i=n+1;i<=2*n;i++){
      if(isPrime(i)){
        res++;
      }
    }
    return res;
  }

  //소수인지 판단하는 메소드
  public static boolean isPrime(int i){
    if(i<2){
      return false;
    }
    for(int k=2;k<=Math.sqrt(i);k++){
      if(i%k==0){
        return false;
      }
    }
    return true;
  }
}
