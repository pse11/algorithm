import java.io.*;


public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //테스트 케이스 입력
    int T = Integer.parseInt(br.readLine());
    for(int i=0;i<T;i++){
      long n = Long.parseLong(br.readLine());  
      if(n<=1){ //n이 0,1이면 해당 값보다 크거나 같은 값중 최소 소수는 2이다.
         n=2; 
      }
      while(true){
        int count = 0;
        for(int j=2;j<=Math.sqrt(n);j++){ //√N이하의 자연수로 값이 나눠지면 소수가 아니다.
          if(n%j==0){ //소수가 아니면
            count++; //count 1 증가
            break; 
          }
        }
        if(count==0){ //소수인 경우
          System.out.println(n);
          break;
        }
        n++; //소수 찾지 못하면 n 증가시켜 반복
      }
      
    }
  }
}