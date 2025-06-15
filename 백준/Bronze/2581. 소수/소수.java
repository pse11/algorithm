import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int M = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());
    int sum =0;
    int min =N;
    int c=0;
    int count =0; //소수 개수
    for(int i=M;i<=N;i++){
      c=0;
      if(i!=1){
        for(int j=2;j<i;j++){ //소수인경우찾기
          if(i%j==0){
            c++;
          }
        }
        if(c==0){//소수일때
          sum+=i;
          if(min>i){
            min=i;
          }
          count++;
        }
      }
    }
    if(count==0){
      bw.write("-1");
    }else{
      bw.write(sum+"\n"+min);
    }
    bw.close();
  }
}