import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    //EOF 처리
    String str;
    while((str=br.readLine())!=null){
      bw.write(str+"\n");
    }
    bw.close();
  }
}