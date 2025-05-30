import java.io.*;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());
    for(int i=0;i<T;i++){
      String[] str = br.readLine().split("");
      bw.write(str[0]+str[str.length-1]);
      bw.newLine();
    }
    bw.close();
  }
}