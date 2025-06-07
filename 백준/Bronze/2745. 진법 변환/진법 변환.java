import java.io.*;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer str = new StringTokenizer(br.readLine());
    String N = str.nextToken();
    int B = Integer.parseInt(str.nextToken());

    int idx = 0;
    int sum =0;
    for(int i=N.length()-1;i>=0;i--){
      if((int)N.charAt(i)>=65){
        sum+=((int)N.charAt(i)-55)*Math.pow(B,idx);
      }else{
        sum+=Character.getNumericValue(N.charAt(i))*Math.pow(B,idx);
      }
      idx++;
    }
    bw.write(sum+"");
    bw.close();
  }
}