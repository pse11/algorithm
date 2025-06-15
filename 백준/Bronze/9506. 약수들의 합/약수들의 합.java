import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    while(true){
      int sum = 0;
      String result = "";
      int n = Integer.parseInt(br.readLine());
      if(n==-1){
        break;
      }
      for(int i=1;i<=n;i++){
        if(n%i==0){
          if(n!=i){
            sum+=i;
            result+=(i+" ");
          }
        }
      }
      String[] str = result.split(" ");
      String res = String.join(" + ",str);
      if(sum==n){
        bw.write(n+" = "+res+"\n");
      }else{
        bw.write(n+" is NOT perfect.\n");
      }
    }
    bw.close();
  }
}