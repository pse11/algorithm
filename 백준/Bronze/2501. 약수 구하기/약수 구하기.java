import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    String nums = ""; //약수들을 저장할 문자열
    for(int i=1;i<=N;i++){
      if(N%i==0){
        nums+=(i+" ");
      }
    }
    String[] result = nums.split(" ") ;
    if(K<=result.length){
      bw.write(result[K-1]);
    }else{
      bw.write("0");
    }
    bw.close();
    
  }
}