import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String result = "";
    while(true){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      if(a==0&&b==0){
        break;
      }
      if(a%b==0){ //첫번째 숫자가 두번째 숫자의 배수일때
        result+="multiple\n";
      }else if(b%a==0){ //첫번째 숫자가 두번째 숫자의 약수일때
        result+="factor\n";
      }else{ //둘다 아닐때
        result+="neither\n";
      }
      
    }
    bw.write(result);
    bw.close();
  }
}